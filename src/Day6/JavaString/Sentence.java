package Day6.JavaString;

import java.util.Scanner;

public class Sentence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        System.out.println("Length"+words.length);
        for (int i = str.length()-1; i>=0 ; i--) {
            System.out.print(str.charAt(i));
        }

        System.out.println();
        String str2 = str.replaceAll("[aeiouAEIOU]","*");
        System.out.println(str2);
    }
}
