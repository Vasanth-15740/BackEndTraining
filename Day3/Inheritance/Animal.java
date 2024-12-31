//Create a base class Animal with a method sound(). Derive two classes Dog and Cat from Animal. Override the sound() method to print “Bark” for Dog and “Meow” for Cat.

package Day3.Inheritance;

public class Animal {
    public void Sound() {
        System.out.println("Animal will make Sound");
    }

    public static class Dog extends Animal {
        public void Sound() {
            super.Sound();
            System.out.println("Dog will bark");
        }
    }

    public static class cat extends Animal{
        public void Sound() {

            System.out.println("Cat will meow");
        }
    }

    public static void main(String[] args) {
        Animal s =new Dog();
        s.Sound();
        Animal c = new cat();
        c.Sound();

    }
}
