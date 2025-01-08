package Day10;

import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedLists {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String> ll=new LinkedList();
while(true) {
    System.out.println("Add a Task:\nRemove a Task:\nDisplay Task:\nExit");
    System.out.println("Enter the Choice:");
    int n = sc.nextInt();
    sc.nextLine();
    switch (n) {
        case 1:
            System.out.println("Add the Task:");
        ll.add(sc.nextLine());
            break;
        case 2:
            System.out.println("Remove the Task:");
            ll.remove(sc.nextLine());
            break;
        case 3:
            for (String i : ll) {
                System.out.println(i);
            }
        case 4:
            sc.close();
            return;
    }
}

    }
}
