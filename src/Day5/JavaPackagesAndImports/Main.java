package Day5.JavaPackagesAndImports;
import Day5.JavaPackagesAndImports.Shape.*;
public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.CalculateArea(9);
        Rectangle r = new Rectangle();
        r.CalculateArea(5, 6);
    }
}
