package Day7.ExtraProblems;

public class Chip {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int count=0;
        for (int i = 0; i < arr.length ; i++) {
            if (i%2==0){
                count++;
            }
        }
        System.out.println(Math.min(count, arr.length-count));
    }
}