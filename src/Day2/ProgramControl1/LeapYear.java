//Write a program to determine if a given year is a leap year.

package Day2.ProgramControl1;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 == 0 || year % 400 == 0) {
            System.out.println("Leap Year");
        }
    }
}
