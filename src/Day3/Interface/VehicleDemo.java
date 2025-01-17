//Define an interface Vehicle with a method start(). Derive two interfaces FourWheeler and TwoWheeler from it, each adding its specific methods. Implement these in relevant classes.

package Day3.Interface;

interface IVehicle {
    void start();
}

interface FourWheeler extends IVehicle {
    void driveFourWheeler();
}

interface TwoWheeler extends IVehicle {
    void driveTwoWheeler();
}

class Car implements FourWheeler {
    public void start() {
        System.out.println("Car is starting");
    }

    public void driveFourWheeler() {
        System.out.println("Driving a four-wheeler");
    }
}

class Bike implements TwoWheeler {
    public void start() {
        System.out.println("Bike is starting");
    }

    public void driveTwoWheeler() {
        System.out.println("Driving a two-wheeler");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        FourWheeler car = new Car();
        car.start();
        car.driveFourWheeler();
        TwoWheeler bike = new Bike();
        bike.start();
        bike.driveTwoWheeler();
    }
}
