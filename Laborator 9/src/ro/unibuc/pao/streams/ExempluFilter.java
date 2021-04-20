package ro.unibuc.pao.streams;

import ro.unibuc.pao.exemple.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ExempluFilter {

    public static void main(String[] args) {
        // check Predicate functional interface
        List<String> fruits = Arrays.asList("Apple", "Cherry", "Banana", "Pineapple");

        Predicate<String> predicate = fruit -> fruit.equals("Banana");
        fruits.stream() // Stream<String>
                .peek(e -> System.out.println("Unfiltered value: " + e))
                .filter(predicate) // predicate parameter, Stream<String> return
                .peek(e -> System.out.println("Filtered value: " + e))
                .forEach(System.out::println); // consumer parameter, void return
    }
}
