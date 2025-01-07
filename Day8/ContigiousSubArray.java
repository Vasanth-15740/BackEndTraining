package Day8;

public class ContigiousSubArray {
    public static void main(String[] args) {
        int max=0;
        int[] arr ={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        for (int i = 0; i < arr.length ; i++) {
            int sum=0;
            for (int j = i; j < arr.length ; j++) {
                sum +=arr[j];

            if(max<sum){
                max=sum;
            }
            }
        }
        System.out.println(max);
    }
}
