package Day1;
import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String result = n%2==0 ? "Even":"Odd";
        System.out.println(result);
    }
}
