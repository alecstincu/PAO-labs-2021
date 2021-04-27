package ro.unibuc.pao.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Scrieti o metoda care intoarce lungimea celui mai lung string dintr-o lista.
public class Exercitiul4 {

    public static void main(String[] args) {
        List<String> colours = Arrays.asList("Red", "Green", "Pink", "Purple", "Yellow");

        Optional<Integer> result = colours.stream().map(string -> string.length()).max((x, y) -> x.compareTo(y));
        if (result.isPresent()) {
            System.out.println(result.get());
        }

        colours.stream().map(String::length).max(Integer::compareTo).ifPresent(System.out::println);
    }
}
