//Create a program to calculate the sum of all elements in an array.

package Day3.Arrays;

import java.util.Scanner;
public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int x:arr){
            sum+=x;
        }
        System.out.println(sum);
    }
}
