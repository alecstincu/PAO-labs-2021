package ro.unibuc.pao.operations;

import java.util.Arrays;
import java.util.List;

public class SleepExample {

    public static void main(String[] args) throws InterruptedException {
        List<String> info = Arrays.asList("Hello", "there", "Hi", "again!");
        for (String s : info) {
            // suspenda executarea threadului curent pt un nr de ms
            Thread.sleep(2000);

            System.out.println(s);
        }
    }
}
