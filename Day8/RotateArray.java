package Day8;
import java.util.LinkedList;

public class RotateArray {
    public static void main(String[] args) {

        int n = 3;
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        LinkedList<Integer> l1 = new LinkedList<>();
        for (int i : arr) {
            l1.add(i);
        }
        for (int i = 0; i < n; i++) {
            l1.addFirst(l1.removeLast());
        }
        for (int i : l1) {
            System.out.print(i);
        }
    }
}
