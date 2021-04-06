package ro.unibuc.pao.practice;

import java.util.Scanner;

/**
 * Definiti o clasa care implementeaza operatii pe numere double, in care primul trebuie sa fie mai mic decat al doilea.
 * Operatiile vor arunca si exceptii.
 * In cazul in care nu apare vreo exceptie, scrieti intr-un fisier operatia executata, inputurile si rezultatul final.
 * Ex:
 * [ADD] 2.0 3.0 5.0
 * [DIVIDE] 5.0 2.0 2.5
 */
public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti primul nr: ");
        double nr1 = scanner.nextDouble();
        System.out.println("Introduceti al doilea nr: ");
        double nr2 = scanner.nextDouble();

        // TODO: initialize
        Calculator calculator = null;

        // TODO: write to file if conditions met
    }
}
