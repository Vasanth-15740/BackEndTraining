package Day18;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student{
    private String name;
    private String department;
    private List<Integer> mark;
    private String grade;
    public  Student(String name,String department,List<Integer>mark){
        this.name=name;
        this.department=department;
        this.mark=mark;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public List<Integer> getMark() {
        return mark;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public double getAverageMarks() {
        return mark.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    @Override
    public String toString() {
        return String.format("%s (%s): Avg = %.2f, Grade = %s", name, department, getAverageMarks(), grade);
    }
}
public class StudentPerformance {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("vasanth", "Computer Science", Arrays.asList(67, 78, 80, 89, 90)),
                new Student("Anand", "Mathematics", Arrays.asList(78, 88, 72, 89, 38)),
                new Student("Bharath", "Physics", Arrays.asList(98, 99, 57, 79, 67)),
                new Student("Shiva", "Computer Science", Arrays.asList(95, 92, 90, 96, 94)),
                new Student("Gnana", "Mathematics", Arrays.asList(88, 56, 52, 80, 97)),
                new Student("shankar", "Physics", Arrays.asList(45, 60, 95, 51, 62)),
                new Student("Kumar", "Mathematics", Arrays.asList(70, 42, 48, 39, 43)),
                new Student("Sanjay", "Computer Science", Arrays.asList(28, 80, 82, 74, 99)));
        students.forEach(student -> {
            double grade = student.getAverageMarks();
            if (grade >= 85) {
                student.setGrade("A");
            } else if (grade >= 70) {
                student.setGrade("B");
            } else if (grade >= 50) {
                student.setGrade("C");
            } else {
                student.setGrade("D");
            }
        });
        students.stream().sorted(Comparator.comparingDouble(Student::getAverageMarks))
                .forEach(System.out::println);

        System.out.println("_");

        System.out.println("Top 3 Student");
        students.stream().sorted((s1,s2)->Double.compare(s2.getAverageMarks(), s1.getAverageMarks()))
                .limit(3).
                forEach(System.out::println);

        System.out.println("");

        System.out.println("Average Grade in Each Student");
        students.stream().collect(Collectors.groupingBy(Student::getDepartment, Collectors.averagingDouble(Student::getAverageMarks)))
                .forEach(( avgMarks,department) -> System.out.println(department + ": " + avgMarks));

        System.out.println("");

        System.out.println("Top Student in Each Department");
        students.stream().collect(Collectors.groupingBy(Student::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(Student::getAverageMarks))))
                .forEach((department,topStudent)->

                        System.out.println(department+" : "+topStudent.get().getName()));

        System.out.println("");

        System.out.println("Failed Student");
        students.stream().filter(student -> student.getAverageMarks()>50)
                .collect(Collectors.groupingBy(Student::getDepartment,Collectors.counting())).forEach((department,count)-> System.out.println(department+" : "+count));

    }
}