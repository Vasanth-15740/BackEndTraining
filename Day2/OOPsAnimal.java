package Day2;

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
