//Create a class Employee with attributes id, name, and salary. Use the this keyword to resolve naming conflicts between local variables and instance variables.

package Day2.ThisAndOverloading;
public class OOPsEmployee {
    private int id;
    private String name;
    private int salary;

    public OOPsEmployee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public static void main(String[] args) {
        int id=1;
        OOPsEmployee employee = new OOPsEmployee(45, "Jagan", 45000);
        System.out.println("instance id: "+employee.id);
        System.out.println("local id: "+id);
    }
}
