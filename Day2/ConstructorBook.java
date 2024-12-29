package Day2;
public class ConstructorBook
{
    String name;
    int price;

    public ConstructorBook() {
        this.name = "Java";
        this.price = 500;
    }

    public static void main(String[] args) {
        ConstructorBook obj = new ConstructorBook();
        System.out.println("Name: " + obj.name);
        System.out.println("Price: " + obj.price);
    }
}
