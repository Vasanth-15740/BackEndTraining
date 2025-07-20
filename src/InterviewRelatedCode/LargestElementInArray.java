package InterviewRelatedCode;

public class LargestElementInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,45,6,3,7,8,9};
        int max =0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
