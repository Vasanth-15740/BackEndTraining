//Create a program to simulate a simple calculator using switch-case.

package Day2.ProgramControl1;
import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        System.out.println("Enter the operation you want to perform: 1 - Addition 2-Subtraction 3- Multiplication 4-Division");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println(n+m);
                break;
            case 2:
                System.out.println(n-m);
                break;
            case 3:
                System.out.println(n*m);
                break;
            case 4:
                System.out.println(n/m);
                break;
        }
    }
}
