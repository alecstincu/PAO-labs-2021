package ro.unibuc.pao.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Scrieti o metoda care genereaza un string dintr-o lista de string-uri.
// Ex input: ["1", "2", "3"] -> "1,2,3,"
public class Exercitiul3 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "2", "3", "4", "5");
        System.out.println(list);

        String result = list.stream().collect(Collectors.joining(","));
        String result2 = String.join(",", list);
        System.out.println(result);
    }
}
