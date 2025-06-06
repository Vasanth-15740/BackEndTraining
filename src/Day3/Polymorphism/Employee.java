//Write a program with a base class Employee that has a method calculateSalary(). Derive two classes Manager and Developer, and override the calculateSalary() method in both to display different salaries.

package Day3.Polymorphism;

public class Employee {

    int amount;
    public Employee(int amount){
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