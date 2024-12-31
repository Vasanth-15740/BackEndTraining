//Create a class Book with default values for title and author. Write a default constructor to initialize these attributes.

package Day2.Constuctors;
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
