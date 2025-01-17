//Create a class Animal with a method speak(). Derive classes Dog and Cat and override the speak() method to display appropriate sounds.

package Day2.OopsBasic1;
public class OOPsAnimal
{
    public void speak()
    {
        System.out.println("Animal speaks");
    }
    public static class Dog extends OOPsAnimal
    {
        public void speak()
        {
            System.out.println("Dog barks");
        }
    }
    public static class Cat extends OOPsAnimal
    {
        public void speak()
        {
            System.out.println("Cat meows");
        }
    }
    public static void main(String[] args) {
        OOPsAnimal animal = new OOPsAnimal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        animal.speak();
        dog.speak();
        cat.speak();


    }
}
