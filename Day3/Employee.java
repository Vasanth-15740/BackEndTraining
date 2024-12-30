package Day3;

public class Employee {

    int amount;
    Employee(int amount){
        this.amount=amount;
    }

    public void calculateSalary(){
        System.out.println("The salary of employee is : "+amount);
    }

    public static class Manager extends Employee{
        Manager(int amount) {
            super(amount);
        }

        public void calculateSalary() {
            System.out.println("The salary of manager is : "+amount);
            }
    }

    public static class Developer extends Employee{
        Developer(int amount) {
            super(amount);
        }

        public void calculateSalary() {
            System.out.println("The salary of developer is : "+amount);
        }
    }
    public static void main(String[] args) {
        Employee emp;
        emp = new Manager(1000);
        emp.calculateSalary();
        emp = new Developer(500);
        emp.calculateSalary();;
    }
}