//Write a program to print a pyramid pattern using nested loops.

package Day2.ProgramControl1;
import java.util.Scanner;
public class PyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for (int i= 0 ; i<n;i++ ){
            for ( int k = n-i ; k>1; k--){
                System.out.print(" ");
            }
            for(int j = 0; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}
