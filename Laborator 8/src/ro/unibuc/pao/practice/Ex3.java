package ro.unibuc.pao.practice;

import ro.unibuc.pao.StringComparator;

import java.util.Map;
import java.util.TreeMap;

/**
 * Se da un string.
 * Sa se afiseze numarul de aparitii pt fiecare litera.
 * <p>
 * Input:
 * "abracadabra":
 * <p>
 * Output:
 * a: 5
 * b: 2
 * c: 1
 * d: 1
 * r: 2
 */
public class Ex3 {

    public static void main(String[] args) {
        String input = "abracadabra";

        Map<String, Integer> map = new TreeMap<>(new StringComparator());

        for (char c : input.toCharArray()) {
            if (map.containsKey(String.valueOf(c))) {
                Integer value = map.get(String.valueOf(c));
                map.put(String.valueOf(c), ++value);
            } else {
                map.put(String.valueOf(c), 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " value: " + entry.getValue());
        }
    }
}
