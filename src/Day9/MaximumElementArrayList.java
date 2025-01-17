//Create a program to find the maximum element in an ArrayList of integers.
//Input Example:
//Input list: [15, 22, 8, 42, 17]

package Day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElementArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println(Collections.max(arr));
    }

}
