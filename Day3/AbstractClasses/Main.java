//Create an abstract class Appliance with methods turnOn() (abstract) and turnOff() (non-abstract). Derive a class Fan and implement turnOn().

package Day3.AbstractClasses;
abstract class Appliance {

    public abstract void turnOn();
    public void turnOff() {
        System.out.println("Turned off.");
    }//cannot be overridden
}

class Fan extends Appliance {
    public void turnOn() {
        System.out.println("Turned on.");
    }
}
public class Main {
    public static void main(String[] args) {
        Appliance fan = new Fan();
        fan.turnOn();
        fan.turnOff();
    }
}
