package Day3;
abstract class Appliance {

    public abstract void turnOn();{}
    public void turnOff() {
        System.out.println("Turned off.");
    }
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
