//Create a program to transpose a given matrix.

package Day3.Arrays;

import java.util.Scanner;
public class TransposeMatix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Before The matrix is : ");
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(arr[i][j]+"");
            }
            System.out.println();
        }
        System.out.println("After The matrix is : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[j][i]+"");
            }
            System.out.println();
        }
    }
}
