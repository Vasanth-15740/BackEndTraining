//Implement a program that shifts an integer left and right by 2 positions and prints the result.
//Use the ^ operator to demonstrate XOR functionality between two integers.

package Day1;
import java.util.Scanner;
public class Xornumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num1 = scanner.nextInt();
        int leftShift = num1<<2;
        int rightShift = num1>>2;
        System.out.println("Original Number:" +num1);
        System.out.println("Left shifted :" +leftShift);
        System.out.println("Right shifted:" +rightShift);
        int xorResult = leftShift ^ rightShift;
        System.out.println("Xor of num : "+xorResult);
    }
}

