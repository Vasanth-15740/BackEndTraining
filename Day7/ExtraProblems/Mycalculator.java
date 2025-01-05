package Day7.ExtraProblems;

 interface AdvancedArithmetic {
    void divisor_sum(int n);
}
public class Mycalculator implements AdvancedArithmetic{
    int i;
    Mycalculator(int i){
        this.i=i;
    }
    @Override
    public void divisor_sum(int n) {
        int sum=0;
        for (int j = 1; j <=n; j++) {
            if(n%j==0){
                sum+=j;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Mycalculator m = new Mycalculator(6);
        m.divisor_sum(m.i);
    }
}


