//Create a class Shape with a method area(). Derive a class Rectangle with attributes length and breadth, and override the area() method. Further, derive a class Square from Rectangle and demonstrate multilevel inheritance.

package Day3.Inheritance;
public class Shape {
    public void area() {
        System.out.println("The area of shape is : ");
    }
}
    class Rectangle extends Shape {
        int length;
        int breath;

        public Rectangle(int length, int breath) {
            this.length = 5;
            this.breath = 6;
        }

        public void area() {
            System.out.println("The area of rectangle is : " + (length * breath));
        }
    }

    class Square extends Rectangle {
        double side;

        public Square(int length, int breath,double side) {
            super(length,breath);
            this.side = side;
        }

        public void area() {
            super.area();
            System.out.println("The area of square is : " + (side * side));
        }

        public static void main(String[] args) {
            Square s = new Square(4,6,5.0);
            s.area();
        }
    }
