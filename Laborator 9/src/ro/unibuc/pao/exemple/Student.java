package ro.unibuc.pao.exemple;

import java.util.Arrays;
import java.util.Comparator;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {

    }

    public int getAge() {
        return age;
    }

    public static String test() {
        return "test";
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Student[] students = {new Student("Maria", 20)};

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        Arrays.sort(students, (o1, o2) -> o1.getAge() - o2.getAge());
    }
}


