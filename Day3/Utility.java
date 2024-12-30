package Day3;

import java.util.Scanner;

public class Utility
{
    public static String convertToUpper(String str){
        return str.toUpperCase();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(convertToUpper(str));
    }
}
