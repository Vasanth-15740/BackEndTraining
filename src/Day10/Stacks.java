package Day10;

import java.util.Scanner;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<String> ll = new Stack<>();
        int n=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();

            if(str.substring(0,4).equalsIgnoreCase("Type")) {
                ll.push(str.substring(5));
            }
            else{
                ll.pop();
            }
        }
        for(String ans:ll){
            System.out.print(ans+" ");
        }
    }
}
