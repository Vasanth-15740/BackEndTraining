//Write a program to add two 2D matrices.
package Day3.Arrays;

import java.util.Scanner;
public class TwoDimensionalMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row =3;
        int col =3;
        int [][]arr = new int[row][col];
        int [][]arr1 = new int[row][col];
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                arr1[i][j]=sc.nextInt();
            }
        }
        int arr2[][]=new int[row][col];
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                arr2[i][j]=arr[i][j]+arr1[i][j];
            }
        }
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <col ; j++) {
                System.out.print(arr2[i][j]+"");
            }
            System.out.println();
        }

    }
}
