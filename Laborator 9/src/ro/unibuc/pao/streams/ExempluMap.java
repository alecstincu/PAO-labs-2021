package ro.unibuc.pao.streams;

import java.util.Arrays;
import java.util.List;

public class ExempluMap {

    public static void main(String[] args) {
        List<String> studentNames = Arrays.asList("Alexandra", "Sara", "Maria", "Bianca", "Georgiana");

        studentNames.stream()
                .map(name -> name.length()) // Stream<Integer>; or use method reference String::toUpperCase
                .forEach(System.out::println);
    }
}
