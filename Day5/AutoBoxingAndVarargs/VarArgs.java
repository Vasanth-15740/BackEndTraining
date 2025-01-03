package Day5.AutoBoxingAndVarargs;

public class VarArgs {
    public static void main(String[] args) {

       Sum(4,5,6,7,8,9,10);
    }


    static void Sum(int... val){
        int Added=0;
        for(int i : val){
        System.out.println(Added+=i);
    }
    }
}
