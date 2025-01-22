package Day16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StudentPassingGrade {
    String name;
    int grade;

    StudentPassingGrade(String name, int grade){
        this.name=name;
        this.grade=grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

   static void display1(List<StudentPassingGrade> list , Predicate<StudentPassingGrade> predicate){
        for(StudentPassingGrade s :list){
            if(predicate.test(s)){
                System.out.println(s.getName());
            }
        }
    }
    public static void main(String[] args) {
        List<StudentPassingGrade> list = new ArrayList<>();
        list.add(new StudentPassingGrade("John" ,75));
        list.add(new StudentPassingGrade("Alice" ,55));
        list.add(new StudentPassingGrade("Mark" ,88));
        display1(list,(s)->s.getGrade()>60);
    }
}
