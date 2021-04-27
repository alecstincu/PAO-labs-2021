package ro.unibuc.pao.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Scrieti o metoda care intoarce o lista cu toate stringurile care au 5 litere.
public class Exercitiul2 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("ana", "maria", "ani", "adela", "Ana");

        List<String> result = list.stream().filter(string -> string.length() == 5).collect(Collectors.toList());
        System.out.println(result);
    }
}
