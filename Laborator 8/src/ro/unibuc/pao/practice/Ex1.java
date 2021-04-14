package ro.unibuc.pao.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * In metoda de comparare, studentii vor fi comparati mai intai dupa medie, apoi dupa numele de familie, apoi dupa prenume.
 */
public class Ex1 {

    public static void main(String[] args) {
        Student s1 = new Student(1L, "Popescu", "Alina", 9.00);
        Student s2 = new Student(2L, "Ionescu", "Maria", 7.50);
        Student s3 = new Student(3L, "Marinescu", "Ana", 7.50);
        Student s4 = new Student(4L, "Ungurescu", "Silvia", 6.20);
        Student s5 = new Student(5L, "Ungurescu", "Cornelia", 6.20);

        // TODO: adaugati cele 5 obiecte de tip student intr-un ArrayList si apoi sortati-l (folosind ambele interfete)
        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
//        for (Student student : studentList) {
//            System.out.println(student);
//        }

        Collections.sort(studentList, new StudentComparator());
        System.out.println(studentList);

        // TODO: folositi un Map<Student, List<String>>, in care se vor adauga perechi: Student, lista de materii si afisati rezultatul
        Map<Student, List<String>> studentListMap = new HashMap<>();
        studentListMap.put(s1, Arrays.asList("Matematica"));
        studentListMap.put(s2, Arrays.asList("Matematica", "Informatica"));
        studentListMap.put(s3, Arrays.asList("Muzica", "Desen"));
        studentListMap.put(s4, Arrays.asList("Sport", "Dans"));
        studentListMap.put(s5, Arrays.asList("Romana", "Engleza"));

        for (Map.Entry<Student, List<String>> studentListEntry : studentListMap.entrySet()) {
            System.out.println("Key: " + studentListEntry.getKey() + " value: " + studentListEntry.getValue());
        }
    }
}
