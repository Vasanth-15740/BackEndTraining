//You are tasked with creating a program to manage student grades using a Vector in Java. Implement the following functionalities:
//Add grades (as integers) to a vector dynamically.
//Print all grades in the vector.
//Calculate and display:
//The highest grade.
//The lowest grade.
//The average grade.
//Allow the user to remove a specific grade by its index.

package Day9;

import java.util.Collections;
import java.util.Vector;
public class StudentGrade {
    public static void main(String[] args) {
        int sum=0;
        Vector vc = new Vector<>();
            vc.add(78);
            vc.add(85);
            vc.add(92);
            vc.add(67);
            vc.add(88);
        vc.remove(vc.get(3));
        for (int i = 0; i < vc.size(); i++) {
            System.out.print(vc.get(i)+" ");
        }
        System.out.println();
        Collections.sort(vc);
        System.out.println("Lowest : "+vc.get(0));
        System.out.println("Highest : "+vc.get(3));

        for (int i = 0; i < vc.size() ; i++) {
            sum+=(int)vc.get(i);
        }
        double n= (double) sum / vc.size();
        System.out.println(n);
    }
}
