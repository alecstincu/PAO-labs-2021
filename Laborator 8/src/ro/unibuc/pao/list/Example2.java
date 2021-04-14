package ro.unibuc.pao.list;

import ro.unibuc.pao.IntegerComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example2 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(8);
        numbers.add(2);
        numbers.add(9);

        Collections.sort(numbers);
        System.out.println(numbers);

        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(numbers);

        numbers.sort(new IntegerComparator());
        System.out.println(numbers);
    }
}
