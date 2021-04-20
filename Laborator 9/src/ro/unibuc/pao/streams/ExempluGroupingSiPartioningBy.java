package ro.unibuc.pao.streams;

import ro.unibuc.pao.exemple.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExempluGroupingSiPartioningBy {

    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("Maria", 21),
                new Student("Bianca", 21),
                new Student("Bogdan", 30),
                new Student("Alexandra", 30),
                new Student("Alexandru", 18)
        );

        Map<Integer, List<Student>> groupingByStudentMap = studentList.stream()
                .collect(Collectors.groupingBy(Student::getAge));

        for (Map.Entry<Integer, List<Student>> listEntry : groupingByStudentMap.entrySet()) {
            System.out.println("Key: " + listEntry.getKey() + " value: " + listEntry.getValue());
        }

        Map<Boolean, List<Student>> partitioningByStudentMap = studentList.stream()
                .collect(Collectors.partitioningBy((Student student) -> student.getAge() > 18));

        for (Map.Entry<Boolean, List<Student>> listEntry : partitioningByStudentMap.entrySet()) {
            System.out.println("Key: " + listEntry.getKey() + " value: " + listEntry.getValue());
        }
    }
}
