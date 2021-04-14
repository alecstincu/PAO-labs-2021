package ro.unibuc.pao.practice;

import java.util.Comparator;

/**
 * In metoda de comparare, studentii vor fi comparati mai intai dupa medie, apoi dupa numele de familie, apoi dupa prenume.
 */
public class StudentComparator implements Comparator<Student> {
    // Returns a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.
    @Override
    public int compare(Student o1, Student o2) {
        int result = o1.getAverageGrade().compareTo(o2.getAverageGrade());
        if (result == 0) {
            int nameResult = o1.getName().compareTo(o2.getName());
            if (nameResult == 0) {
                return o1.getSurname().compareTo(o2.getSurname());
            } else {
                return nameResult;
            }
        } else {
            return result;
        }
    }
}
