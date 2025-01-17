package Day7.ExtraProblems;

public class Altitude {
    public static void main(String[] args) {
        int arr[] = {-5, 1, 5, 0, -7};
        int m = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            m += arr[i];
            max = Math.max(max, m);
        }
        System.out.println(max);
    }
}