package Day7.ExtraProblems;

public class TargetIntegerArray {
    public static void main(String[] args) {
        int[]arr1 = {2,7,11,15};
        for (int i = 0; i < arr1.length-1 ; i++) {
            for (int j = i+1; j < arr1.length ; j++) {
                if(arr1[i]+arr1[j]==9){
                    System.out.println(i+" "+ j);
                }
            }
        }
    }
}
