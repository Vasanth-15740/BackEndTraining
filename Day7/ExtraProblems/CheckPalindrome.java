package Day7.ExtraProblems;

import java.util.Scanner;

public class CheckPalindrome {
    void check(String s){
        int count=0;
        int n = s.length();
        int m=n-1;
        for (int i = 0 ; i <n/2; i++) {
                if(s.charAt(i)==s.charAt(m)){
                    count++;
            }
               m--;
        }
        if(count==0){
            System.out.println("false");
            return;
        }
        if(count==n/2 || count+1==n/2){
            System.out.println("True");
        }
    }
    public static void main(String[] args) {
        CheckPalindrome cp = new CheckPalindrome();
        Scanner sc = new Scanner(System.in);
       cp.check("aba");
       cp.check("abca");
        cp.check("abc");

    }
}
