package Day3;
interface InheritanceAnimal{
    void eat();
    void sleep();
}
class Dog implements InheritanceAnimal {
    public void eat(){
        System.out.println("Dog is eating");
    }
    public void sleep(){
        System.out.println("Dog is sleeping");
    }
}
public class Cat implements InheritanceAnimal{
    public void eat(){
        System.out.println("Cat is eating");
    }
    public void sleep(){
        System.out.println("Cat is sleeping");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.sleep();
        Cat c = new Cat();
        c.eat();
        c.sleep();
    }
}

