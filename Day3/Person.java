package Day3;

public  class Person {
    String name;
    int age;

    public  Person(String name,int age) {
    this.name = name;
    this.age = age;
    }

public static class Student extends Person {
    int roll;
    int mark;

    public Student(String name, int age, int roll, int mark) {
        super(name, age);
        this.roll = 1;
        this.mark = 100;
    }
    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Roll : " + roll);
        System.out.println("Mark : " + mark);
    }
}
    public static void main(String[] args) {
        Student s = new Student("vk", 21, 1, 90);
        s.display();

    }
}

