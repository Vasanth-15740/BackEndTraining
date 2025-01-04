package Day6.Clone;

public class Student implements Cloneable{
    public String name;
    public int age;

    Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args) {
        try {
            Student s1 = new Student("vk", 21);
            Student Clones1 = (Student) s1.clone();
            System.out.println(s1.name+" "+s1.age);
            System.out.println(Clones1.name+" "+Clones1.age);
        }
        catch(CloneNotSupportedException e){
            System.out.println("Clone not supported");
        }
    }
}
