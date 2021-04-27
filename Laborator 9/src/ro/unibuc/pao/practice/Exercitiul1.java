package ro.unibuc.pao.practice;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// Scrieti o metoda care intoarce media aritmetica a unei liste de integers.
public class Exercitiul1 {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 5, 8, 9, 10);

        IntSummaryStatistics intSummaryStatistics = integerList.stream().collect(Collectors.summarizingInt(val -> val));
        System.out.println(intSummaryStatistics.getAverage());

        OptionalDouble optionalDouble = integerList.stream().mapToInt(val -> val).average();
        if (optionalDouble.isPresent()) {
            System.out.println(optionalDouble.getAsDouble());
        }

        OptionalDouble optionalDouble1 = IntStream.of(1, 2, 5, 8, 9, 10).average();
        if (optionalDouble1.isPresent()) {
            System.out.println(optionalDouble1.getAsDouble());
        }
    }
}
