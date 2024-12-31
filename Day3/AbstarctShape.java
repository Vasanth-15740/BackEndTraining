package Day3;

public class AbstarctShape {

    public void CalculateArea()

    public static class Circle extends AbstarctShape{
         double r;
         Circle(double r){
             this.r=r;
         }
            public void CalculateArea(){
                System.out.println("Area of circle is : "+(3.14*r*r));
            }
    }

    public static class Rectangle extends AbstarctShape{
        int length;
        int breathj;
        Rectangle(int length,int breathj){
            this.length=length;
            this.breathj=breathj;
        }
        public void CalculateArea(){
            System.out.println("Area of rectangle is : "+(length*breathj));
        }
    }

    public static void main(String[] args) {
        AbstarctShape s= new Circle(5.0);
        s.CalculateArea();
        AbstarctShape s1= new Rectangle(4,6);
        s1.CalculateArea();
    }
}
