package ro.unibuc.pao.practice;

import java.util.Objects;

/**
 * In metoda de comparare, studentii vor fi comparati mai intai dupa medie, apoi dupa numele de familie, apoi dupa prenume.
 */
//public class Student implements Comparable<Student> {
public final class Student {
    private final Long id;
    private final String name;
    private final String surname;
    private Double averageGrade;

    public Student(Long id, String name, String surname, Double averageGrade) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Long getId() {
        return id;
    }

    public Double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(Double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student: averageGrade=" + averageGrade +
                ", name=" + name +
                ", surname=" + surname + "\n";
    }

    // Returns a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object.
//    @Override
    public int compareTo(Student o) {
        int result = this.getAverageGrade().compareTo(o.getAverageGrade());
        if (result == 0) {
            int nameResult = this.getName().compareTo(o.getName());
            if (nameResult == 0) {
                return this.getSurname().compareTo(o.getSurname());
            } else {
                return nameResult;
            }
        } else {
            return result;
        }
    }

    // TODO: Suprascrieti metodele equals si hashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Student)) {
            return false;
        }
        Student student = (Student) o;
        return Objects.equals(getId(), student.getId()) && Objects.equals(getName(), student.getName()) && Objects.equals(getSurname(), student.getSurname()) && Objects.equals(getAverageGrade(), student.getAverageGrade());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSurname(), getAverageGrade());
    }
}
