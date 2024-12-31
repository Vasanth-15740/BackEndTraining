//Write a program to find the largest of three numbers using the ternary operator.

package Day2.Opertors;
import java.util.Scanner;
public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = a>b?(a>c?a:c):(b>c?b:c);
        System.out.println(n);
    }
}