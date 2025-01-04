package Day6.LangClass;
import java.lang.Math;

public class LangClassProblem {

    void Operation(double n){
        System.out.println(Math.sqrt(n));
    }
    void Operation(int n){
        System.out.println(Math.pow(n,3));
    }
    void MaxNumber(int m,int n){
        System.out.println(Math.max(m,n));
    }
    void Manipulation(String str){
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.substring(1,3));
    }
    public static void main(String[] args) {
        LangClassProblem p =new LangClassProblem();
        p.Operation(4);
        p.Operation(4.0);
        p.MaxNumber(6,9);
        p.Manipulation("JokerMan");
        int l=0;
        long starttime =System.currentTimeMillis();
        System.out.println(starttime);
        for (int i = 0; i < 1000; i++) {
            l++;
        }
        long endtime = System.currentTimeMillis();
        System.out.println(endtime-starttime);
    }
}
