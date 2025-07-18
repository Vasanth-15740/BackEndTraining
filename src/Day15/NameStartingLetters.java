package Day15;
import java.util.*;
import java.util.stream.Collectors;

class Student1 {
    private String name;

    public Student1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class NameStartingLetters {

    public static List<Student1> findStudentsByLetter(List<Student1> students, char letter) {
        return students.stream().filter(student -> student.getName().startsWith(String.valueOf(letter))).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Student1> students = List.of(
                new Student1("Alice"),
                new Student1("Bob"),
                new Student1("Charlie"),
                new Student1("Diana"),
                new Student1("Eve")
        );

        char letter = 'A'; 
        List<Student1> filteredStudents = findStudentsByLetter(students, letter);

        System.out.println("Students whose names start with '" + letter + "':");
        filteredStudents.forEach(System.out::println);
    }
}
