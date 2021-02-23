package ro.unibuc.pao.io;

import java.util.Scanner;

public class ReadingAndWriting {

    public static void main(String[] args) {

        // The Scanner class is useful when reading values, as it has utility methods for most primitives.
        Scanner scanner;

        // It can be set to read from the System console.
        scanner = new Scanner(System.in);

        System.out.println("Input text");
        // whole lines of text
        String string = scanner.nextLine();

        System.out.println("Read boolean: ");
        // It can read booleans
        boolean b = scanner.nextBoolean();

        // numeric types
        System.out.println("Read int: ");
        int i = scanner.nextInt();

        System.out.println("Read double: ");
        double d = scanner.nextDouble();

        System.out.println("End of reading");

        // Error output stream. (in the IDE and command line, this will behave exactly like the "out" stream, but it can
        // be configured to be redirected separately from it in production use.
        System.err.print("Something bad has happened");
        System.err.println("Same as before, with a \\n at the end");
    }

}