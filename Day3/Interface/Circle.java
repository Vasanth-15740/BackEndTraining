//Define an interface Constants with static fields like PI = 3.14. Create a class Circle that uses this constant to calculate the area of a circle.

package Day3.Interface;

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
