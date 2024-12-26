package Day1;
import java.util.Scanner;
public class Q5 {
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
