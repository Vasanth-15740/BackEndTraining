//Create a program to exit a loop if the user enters the number 0 (use break).

package Day2.ProgramControl1;
import java.util.Scanner;
public class ExitLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
           int j=sc.nextInt();
           if(j==0){
               break;
           }
        }
    }
}

