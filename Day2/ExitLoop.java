package Day2;

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
