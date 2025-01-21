package Day15;
import java.util.*;

class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }
}

public class AverageGpa {
    public static double calculateAverageGpa(List<Student> students) {
        return students.stream()
                .mapToDouble(Student::getGpa)
                .average()
                .orElse(0.0);
    }

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Alice", 3.5),
                new Student("Bob", 3.8),
                new Student("Charlie", 3.2)
        );

        double averageGpa = calculateAverageGpa(students);
        System.out.printf("Average GPA: %.2f%n", averageGpa);
    }
}
