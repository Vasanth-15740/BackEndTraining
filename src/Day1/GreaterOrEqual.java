//Create a program that reads two integers and prints whether the first number is greater than the second using relational operators.
//Use logical operators to combine multiple conditions.

package Day1;
import java.util.Scanner;
public class GreaterOrEqual {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the first integer: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();
            if (num1 > num2) {
                System.out.println("greater");
            } else {
                System.out.println("Not great");
            }

            boolean Greater = num1 > num2;
            boolean Equal = num1 == num2;
            if (Greater || Equal) {
                System.out.println("greater or equal to second number.");
            }
            if (!(num1 < 0 || num2 < 0)) {
                System.out.println("Both are non-negative.");
            }
        }
}