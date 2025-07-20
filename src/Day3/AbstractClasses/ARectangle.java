//Create an abstract class Shape with an abstract method calculateArea().
// Derive classes Circle and Rectangle and implement the calculateArea() method in both.

package Day3.AbstractClasses;
abstract class AShape{
     abstract void calculateArea();
}

class ACircle extends AShape{
    void calculateArea(){
        System.out.println("Area of Circle");
    }
}

class ARectangle extends AShape{
    void calculateArea() {
        System.out.println("Area of Rectangle");
    }

    public static void main(String[] args) {
        AShape a = new ACircle();
        a.calculateArea();
    }
}
