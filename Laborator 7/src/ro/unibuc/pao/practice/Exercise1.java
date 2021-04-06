package ro.unibuc.pao.practice;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Cititi de la stdin o linie de text si scrieti-o in fisier.
 * Nu uitati sa afisati un mesaj sugestiv in cazul aparitiei unei exceptii si sa inchideti resursa dupa terminarea folosirii acesteia.
 */
public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti linia de text: ");
        String line = scanner.next();

        writeUsingFileWriter(line);
    }

    public static void writeUsingFileWriter(String text) {
        try (FileWriter fileWriter = new FileWriter("ex1.txt")) {
            fileWriter.append(text);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
