package InterviewRelatedCode;

public class AmstrongNumber {
    public static void main(String[] args) {
        int n=153;
        int res = 0;
        while(n!=0){
            int digit = n%10;
            res+= digit*digit*digit;
            n=n/10;
        }
        System.out.println(res);
    }
}
