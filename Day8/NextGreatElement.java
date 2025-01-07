package Day8;
import java.util.ArrayList;

public class NextGreatElement {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10};
        ArrayList<Integer> arr1 = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            boolean f = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    arr1.add(arr[j]);
                    f = true;
                    break;
                }
            }
            if (!f) {
                arr1.add(-1);
            }
        }

        System.out.println(arr1);
    }
}
