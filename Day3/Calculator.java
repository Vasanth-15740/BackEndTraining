package Day3;

public class Calculator
{
    int sum=0;
    public int add(int a,int b){
        return sum=a+b;
    }
    public int add(double a, double b){
       return sum+=a+b;
    }
    public int add(int a, int b ,int c){
       return sum+=a+b+c;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(  c.add(3,5));
        System.out.println( c.add(3.456,6.234));
        System.out.println(c.add(3,5,9));

    }
}
