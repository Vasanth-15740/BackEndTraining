//Create a class Student with attributes like name and age. Initialize these attributes using a parameterized constructor.

package Day2.Constuctors;
public class ConstructorStudent
{
     String name;
     int age;

    public ConstructorStudent(String jagan, int i) {
        this.name = jagan;
        this.age = i;
    }

public static void main(String[] args) {
    ConstructorStudent obj = new ConstructorStudent("Jagan", 21);
    System.out.println("Name: " + obj.name);
    System.out.println("Age: " + obj.age);
}
}