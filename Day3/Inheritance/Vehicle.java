//Create a class Vehicle with a method start(). Derive a class Car that overrides the start() method. Write a program to demonstrate method overriding.

package Day3.Inheritance;

public class Vehicle {
    public void Start(){
        System.out.println("Vehicle is starting");
    }
    public class Car extends Vehicle{
        public void Start(){
            System.out.println("Car is starting");
        }
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.Start();
        Car c = v.new Car();
        c.Start();
    }
}
