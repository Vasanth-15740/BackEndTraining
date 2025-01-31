//Find the Top Scorer in Each Department
//Write a method that groups students by department and finds the top scorer in each department using Collectors.groupingBy and maxBy.

package Day15;
import java.util.*;
import java.util.stream.Collectors;

class StudentTopScore {
    String name, department;
    double gpa;

    StudentTopScore(String name, String department, double gpa) {
        this.name = name;
        this.department = department;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return department + ": " + name + " (" + gpa + ")";
    }
}

public class TopScore {
    public static void main(String[] args) {
        List<StudentTopScore> students = List.of(
                new StudentTopScore("Alice", "CS", 3.5),
                new StudentTopScore("Bob", "CS", 3.8),
                new StudentTopScore("Charlie", "Math", 3.2),
                new StudentTopScore("Diana", "Math", 3.6),
                new StudentTopScore("Eve", "Physics", 3.9)
        );


        students.stream()
                .collect(Collectors.groupingBy(
                s -> s.department,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(s -> s.gpa)),
                                Optional::get
                        )
                ))
                .values()
                .forEach(System.out::println);
    }
}
