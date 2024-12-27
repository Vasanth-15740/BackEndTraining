package Day2;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        if (n == 1||n==0){
            System.out.println("Not Prime");
            return;
        }
        for ( int i = 1; i <= n/2; i++){
            if (n % i == 0){
                count++;
            }
        }
        if (count==1){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
