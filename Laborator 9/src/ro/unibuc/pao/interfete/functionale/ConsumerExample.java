package ro.unibuc.pao.interfete.functionale;

import ro.unibuc.pao.exemple.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<Student> studentConsumer = student -> System.out.println(student.getName());
        Consumer<Student> otherWay = System.out::println; // folosind referinta spre metoda; argumentul e dedus din apelul de forma c.accept(ceva)

        List<Student> studentList = Arrays.asList(
                new Student("Maria", 21),
                new Student("Bogdan", 30),
                new Student("Alexandru", 18)
        );

        Predicate<Student> studentPredicate = student -> student.getAge() > 20;
        for (Student student : studentList) {
            if (studentPredicate.test(student)) {
                studentConsumer.accept(student);
            }
        }
    }
}
