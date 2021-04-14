package ro.unibuc.pao.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Se citesc dintr-un fisier n numere.
 * Sa se calculeze media aritmetica a acestora si sa se stearga cele mai mici decat aceasta.
 */
public class Ex2 {

    static List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        readUsingBufferedReader();
        System.out.println(numbers);

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }

        int average = sum / numbers.size();
        System.out.println("Average is: " + average);
        Iterator<Integer> iterator = numbers.iterator();
        while(iterator.hasNext()) {
            if (iterator.next() < average) {
                iterator.remove();
            }
        }

        System.out.println(numbers);
    }

    public static void readUsingBufferedReader() {
        try (BufferedReader buffer = new BufferedReader(new FileReader("ex2.txt"))) {
            String line = buffer.readLine();
            while (line != null) {
                numbers.add(Integer.parseInt(line));
                line = buffer.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
