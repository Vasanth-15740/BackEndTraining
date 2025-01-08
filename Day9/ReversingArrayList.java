//Create a program that reverses the order of elements in an ArrayList.

package Day9;

import java.util.ArrayList;
import java.util.Scanner;

public class ReversingArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>ar = new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            ar.add(sc.nextInt());
        }
        System.out.println("Reversed : "+ar.reversed());
    }
}
