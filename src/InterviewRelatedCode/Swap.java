package InterviewRelatedCode;

public class Swap {
    public static void main(String[] args) {
        int a = 1;
        int b =2;
        int c =3;
        a=a^b;
        b=a^b;
        c=a^b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
