package ro.unibuc.pao.interfete.functionale;

import ro.unibuc.pao.exemple.Student;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () -> new Student("John Doe", 30);
        Supplier<String> name = Student::test; // eq of () -> student.getName(); referinta catre o metoda statica

        Supplier<Student> supplier = Student::new; // referinta catre constructor () -> new Student()

        System.out.println(studentSupplier.get());

        List<Student> studentList = Arrays.asList(
                studentSupplier.get(),
                supplier.get(),
                new Student("Bogdan", 30),
                new Student("Alexandru", 18)
        );
    }
}
