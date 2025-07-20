package InterviewRelatedCode;

import java.util.Scanner;

public class Encapsulation {
    private int a;
    private int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    int getA(){
        return a;
    }
    int getB(){
        return b;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= 25;
        Encapsulation e = new Encapsulation();
        e.setA(n);
        System.out.println(e.getA());
    }
 }


