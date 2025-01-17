package Day7.ReflectionApi;

public class Person {
    public String name;
    public int age;
    public String Department;

    Person(String name,int age,String Department){
        this.name = name;
        this.age = age;
        this.Department = Department;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String Department(){
        return Department;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDepartment(String Department) {
        this.Department = Department;
    }

     public void Display(String name,int age,String Department){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Department : "+Department);
    }




}
