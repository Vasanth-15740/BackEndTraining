//Write a program to find the factorial of a number using loops and arithmetic operators.

package Day2.Opertors;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is " + fact);
    }
}
