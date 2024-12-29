package Day2;

import java.util.Scanner;

public class OOPsCalculatingArea {

    public static int Area(int l, int b) {
        return l*b;
    }
    public static float Area(float r) {
        return(float) (3.14*r*r);
    }
    public static double Area(double b, double h) {
        return 0.5*b*h;
    }

    public static void main(String[] args) {
        System.out.println("Enter 1 for calculating area of rectangle\nEnter 2 for calculating area of circle\nEnter 3 for calculating area of triangle");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1){
            int l = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Area of rectangle is: "+Area(l,b));
        } else if (n==2) {
        float r=sc.nextInt();
        System.out.println("Area of circle is: "+Area(r));
        } else if (n==3) {
            double b = sc.nextInt();
            double h = sc.nextInt();
            System.out.println("Area of triangle is: "+Area(b,h));
        } else {
            System.out.println("Invalid input");
        }
        }

    }
