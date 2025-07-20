package InterviewRelatedCode;

public class fibonaccie {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int r;
        System.out.print(a);
        System.out.print(b);
        for (int i = 0; i < 10; i++) {
            r=a+b;
            a=b;
            b=r;
            System.out.print(r);

        }

    }
}
