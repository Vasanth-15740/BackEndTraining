package Day3;

interface Constants{
    static double pi = 3.14;
}
public class Circle
{
    public void areaOfCircel(double r){
        System.out.println("Area of circle is : "+(Constants.pi*r*r));
    }
    public static void main(String[] args) {
        Circle c = new Circle();
        c.areaOfCircel(5);
    }
}
