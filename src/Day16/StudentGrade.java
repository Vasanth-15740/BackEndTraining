<<<<<<< HEAD
package Day16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class StudentGrade {
    String name;
    int Mark;

    public StudentGrade(String name,int Mark){
        this.name = name;
        this.Mark = Mark;
    }

    public StudentGrade() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return Mark;
    }

    public void setMark(int mark) {
        Mark = mark;
    }

    public static void main(String[] args) {
        StudentGrade st = new StudentGrade();
        List<StudentGrade> list = new ArrayList<StudentGrade>();
        list.add(new StudentGrade("Vasanth",40));
        list.add( new StudentGrade("Dhanush ",80));
        Consumer<StudentGrade> cons = (s)-> System.out.println(s.getMark()+10);
        list.forEach(cons);
    }
}
=======
package Day16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class StudentGrade {
    String name;
    int Mark;

    public StudentGrade(String name,int Mark){
        this.name = name;
        this.Mark = Mark;
    }

    public StudentGrade() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return Mark;
    }

    public void setMark(int mark) {
        Mark = mark;
    }

    public static void main(String[] args) {
        StudentGrade st = new StudentGrade();
        List<StudentGrade> list = new ArrayList<StudentGrade>();
        list.add(new StudentGrade("Vasanth",40));
        list.add( new StudentGrade("Dhanush ",80));
        Consumer<StudentGrade> cons = (s)-> System.out.println(s.getMark()+10);
        list.forEach(cons);
    }
}
>>>>>>> fd0363781432da3515f6f09997b0fa2620d40b76
