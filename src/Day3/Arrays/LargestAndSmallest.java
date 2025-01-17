//Write a program to find the largest and smallest numbers in an array.

package Day3.Arrays;

import java.util.Scanner;
public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                int temp=0;
                if(arr[j]<arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println(arr[i]+" ");
        }
        System.out.println("Smallest "+ arr[0]);
        System.out.println("Largest "+ arr[arr.length-1]);
    }
}
