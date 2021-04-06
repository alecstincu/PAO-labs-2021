package ro.unibuc.pao.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Sa se citeasca de la tastatura un user si o parola.
 * Se va compara ce se citeste cu inregistrarile existente in fisierul parole.txt.
 * Daca userul si parola se regasesc, se afiseaza mesajul “acces permis”.
 * Daca regasim userul dar parola nu e cea corecta se va semnala o exceptie cu mesajul “parola gresita”
 */
public class Exercise3 {

    private static User[] users;

    public static void main(String[] args) {
        readUsingBufferedReader();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti user:");
        String userFromStd = scanner.next();
        System.out.println("Introduceti parola:");
        String parolaFromStd = scanner.next();

        for (User user : users) {
            if (userFromStd.equals(user.getName()) && parolaFromStd.equals(user.getPassword())) {
                System.out.println("Acces permis");
            } else {
                if (userFromStd.equals(user.getName()) && !parolaFromStd.equals(user.getPassword())) {
                    System.out.println("Parola gresita");
                }
            }
        }
    }

    public static void readUsingBufferedReader() {
        try (BufferedReader buffer = new BufferedReader(new FileReader("parole.txt"))) {
            String line = buffer.readLine();
            while (line != null) {
                String[] lines = line.split(" ");
                add(new User(lines[0], lines[1]));
                // go to next line
                line = buffer.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void add(User user) {
        if (users == null) {
            users = new User[1];
            users[0] = user;
        } else {
            User[] oldUsers = users;
            users = new User[oldUsers.length + 1];
            users = Arrays.copyOf(oldUsers, oldUsers.length + 1);
            users[oldUsers.length] = user;
        }
    }
}

class User {
    private final String name;
    private final String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
