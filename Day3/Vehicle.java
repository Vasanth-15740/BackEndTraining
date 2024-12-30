package Day3;

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
