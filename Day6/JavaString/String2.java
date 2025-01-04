package Day6.JavaString;

import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int n = str1.compareTo(str2);
        if(n==0){
            System.out.println("Both are equal");
        }
        else if(n>0){
            System.out.println("First is greater");
        }
        else{
            System.out.println("Second is greater");
        }
        if (str1.equals(str2)){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Both are not equal");
        }
        if (str1.equalsIgnoreCase(str2)){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Both are not equal");
        }
        String str3 = str1 + str2;
        System.out.println(str3);
    }
}
