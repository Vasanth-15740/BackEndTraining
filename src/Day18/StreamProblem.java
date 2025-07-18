//This project is about analyzing the performance of students in different departments using Java Streams.
// Here's the step-by-step explanation:
//Imagine we have students in three departments (like Computer Science, Mathematics, and Physics).
// Each student has:A name (e.g., "John"),
//Marks for 5 subjects (e.g., 85, 90, 78, etc.),
//A grade (to be calculated based on their average marks).
//We want to:
//Find the top 3 students based on their average marks.
//Assign a grade (A, B, C, D) to each student based on their average marks.
//Find the average marks for each department.
//Identify the top student in each department.
//Count how many students failed in each department (average marks < 50).

package Day18;

import java.util.List;

public class StreamProblem {
    String name;
    String department;
    List<Integer> mark;
    char grade;
    double Averagemark;

    public StreamProblem(String name,List<Integer> mark,String department){
        this.mark=mark;
        this.name=name;
        this.department=department;
        this.grade=calculateGrade();
        this.Averagemark = AverageMarks();
    }

    public List<Integer> getMark() {
        return mark;
    }

    public void setMark(List<Integer> mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public double AverageMarks(){
        return mark.stream().mapToInt(Integer::intValue).average().orElse(0);
    }
    public char calculateGrade() {
        if (Averagemark >= 85) {
            return 'A';
        } else if (Averagemark >= 70) {
            return 'B';
        } else if ( Averagemark >= 50) {
            return 'C';
        } else {
            return 'D';
        }
    }

    @Override
    public String toString() {
        return "name = " + name  + " department = " + department + " mark = " + mark + " grade = " + grade + " Averagemark = " + Averagemark ;
    }
}
