//Write a program that reads an integer and prints "Even" if it is even, or "Odd" if it is odd, using a ternary operator.

package Day1;
import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = n%2==0 ? "Even":"Odd";
        System.out.println(result);
    }
}
