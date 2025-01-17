package Day5.AccessModifierProblem.AnotherPackage;
import Day3.Polymorphism.Employee;
import Day5.AccessModifierProblem.AccessModifierExample.Employeea;
import Day5.AccessModifierProblem.AccessModifierExample.Person;
public class TestAccess {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p.Name);
        Employeea e = new Employeea();
        e.display();
        // p.age = 30;
        // p.address = "New York";
        // p.Salary = 10000;
        // Employee e = new Employee();
        // e.display();

    }
}
