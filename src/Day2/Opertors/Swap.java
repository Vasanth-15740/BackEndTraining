//Write a program to swap two numbers without using a third variable (use XOR).

package Day2.Opertors;
import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before Swapping: a = " + a + " b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swapping: a = " + a + " b = " + b);
    }
}