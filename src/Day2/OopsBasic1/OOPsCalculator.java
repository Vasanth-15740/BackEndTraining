//Implement method overloading in a class Calculator with methods to add integers, doubles, and arrays of numbers.

package Day2.OopsBasic1;
import java.util.Scanner;
public class OOPsCalculator {
    public static int Add(int a, int b) {
        return a + b;
    }
    public static double Add(double a, double b) {
        return a + b;
    }
    public static int add(int num[]) {
        int sum = 0;
        for (int n :num){
            sum=sum+n;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Add(sc.nextInt(),sc.nextInt()));
        System.out.println(Add(sc.nextDouble(),sc.nextDouble()));
        System.out.println("Enter the number of elements to add in array: ");
        int l = sc.nextInt();
        int[] num = new int[l];
        for (int i = 0; i <l ; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println(add(num));
    }
}
