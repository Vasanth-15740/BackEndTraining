package Self;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListProblems {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("1. Add\n" +
                    "2. Remove by its name\n" +
                    "3. Display all\n" +
                    "4. Exit");
            int ch =sc.nextInt();
            sc.nextLine();
            switch(ch){
                case 1:
                    System.out.println("Enter String");
                    l1.add(sc.nextLine());
                    break;
                case 2:
                    System.out.println("Enter String to check and remove");
                    String s =sc.nextLine();
                    if(l1.contains(s)){
                        l1.remove(s);
                    }
                    else {
                        System.out.println("Not Found");
                    }
                    break;
                case 3 :
                    System.out.println("all task in list");
                    System.out.println(l1);
                    break;
                case 4:
                    return;
            }
        }

    }
}
