package ro.unibuc.pao.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ExempluSorted {

    public static void main(String[] args) {
        List<String> studentNames = Arrays.asList("Alexandra", "Sara", "Maria", "Bianca", "Georgiana");

        studentNames.stream() // Stream<String>
                .sorted() // Stream<String>
                .forEach(System.out::println); // void

        System.out.println("--------");

        studentNames.stream()
                .sorted(Comparator.comparing(String::length).reversed()) // Comparator comparing uses function: (studentName) -> studentName.length()
                .forEach(System.out::println);
    }
}
