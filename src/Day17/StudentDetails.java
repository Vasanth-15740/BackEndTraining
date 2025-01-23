package Day17;

import java.util.ArrayList;
import java.util.List;

public class StudentDetails {
    String name;
    int mark;

    public StudentDetails(String name,int mark){
        this.mark=mark;
        this.name=name;
    }
    void DisplayDetails(){
        System.out.println("name" + name +" "+ mark);
    }
    public static void main(String[] args) {
        List<StudentDetails> list = new ArrayList<>();
        list.add(new StudentDetails("vasanth ",85));
        list.add(new StudentDetails("Arjun ",87));
        list.add(new StudentDetails("Kavin ",98));
        list.forEach(StudentDetails ::DisplayDetails);
    }
}
