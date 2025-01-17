package Day8;

import java.util.Arrays;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int n = 3;
        int[] arr = {3,0,1};
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if(i==arr[i]){
            }
            else {
                System.out.println(i);
                break;
            }
        }
    }
}
