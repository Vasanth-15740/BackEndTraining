package Day7.Exception2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTwo {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    try{
        int c = a / b;
    }
    catch(ArithmeticException e){
        System.out.println("Error: Division by zero is not allowed.");
    }
    catch(InputMismatchException e){
        System.out.println("InputMissMatch Error occurred");
    }
    }
}
