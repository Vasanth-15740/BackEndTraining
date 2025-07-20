package Day6.ExceptionHandling;

import java.util.Scanner;

public class ExceptionChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        try{
            int n = Integer.parseInt(a)+Integer.parseInt(b);
            System.out.println(n);
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
