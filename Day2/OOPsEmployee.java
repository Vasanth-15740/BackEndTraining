package Day2;

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
