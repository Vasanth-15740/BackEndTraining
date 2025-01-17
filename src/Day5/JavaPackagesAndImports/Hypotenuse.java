package Day5.JavaPackagesAndImports;
import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
public class Hypotenuse {
    static void CalculateHypotenuse(int a, int b){
        System.out.println("Hypotenuse: "+sqrt(pow(a,2)+ pow(b,2)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculateHypotenuse(sc.nextInt(), sc.nextInt());
    }
}