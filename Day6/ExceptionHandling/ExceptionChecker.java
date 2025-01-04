package Day6.ExceptionHandling;

import java.util.Scanner;

public class ExceptionChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try{
            int n = a/b;
        }
        catch (ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed.");
        }
        catch (NumberFormatException e){
            System.out.println("Error: Please enter valid integers");
        }
        catch (Exception e){
            System.out.println("An unexpected error occurred");
        }
    }
}
