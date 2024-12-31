//Write a program that takes a float as input, converts it to int, and displays both values.
//Try a case where narrowing conversion loses precision (e.g., casting 123.456 to int).

package Day1;
import java.util.Scanner;
public class floatConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        float f =sc.nextFloat();
        System.out.println("float : "+f);
        int n = (int)f;
        System.out.println("int : "+n);
    }
}
