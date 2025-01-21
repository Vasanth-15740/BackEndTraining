package Day15;

import java.util.*;

class Students {
        private String name;
        private double gpa;

        public Students(String name, double gpa) {
            this.name = name;
            this.gpa = gpa;
        }

        public String getName() {
            return name;
        }

        public double getGpa() {
            return gpa;
        }

        @Override
        public String toString() {
            return "Student{name='" + name + "', gpa=" + gpa + "}";
        }
    }
    public class Main {

        public static void sortStudentsByGpaDescending(List<Students> students) {
            students.sort((s1, s2) -> Double.compare(s2.getGpa(), s1.getGpa()));
        }

        public static void main(String[] args) {
            List<Students> students = new ArrayList<>();
            students.add(new Students("Alice", 3.5));
            students.add(new Students("Bob", 3.8));
            students.add(new Students("Charlie", 3.2));

            System.out.println("Before sorting:");
            students.forEach(System.out::println);

            sortStudentsByGpaDescending(students);

            System.out.println("\nAfter sorting:");
            students.forEach(System.out::println);
        }
    }