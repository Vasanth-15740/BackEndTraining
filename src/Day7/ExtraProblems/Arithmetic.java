package Day7.ExtraProblems;

public class Arithmetic {
    protected static class Main {

        void add(int i ,int j ){
            System.out.println( i+j);
        }
    }
     protected static class Adder extends Main{
        int i;
        int j;
        protected Adder(int i , int j){
            this.i=i;
            this.j=j;
            super.add(i,j);
        }

    }
    public static void main(String[] args) {
        Adder a = new Adder(5,7);

    }
}
