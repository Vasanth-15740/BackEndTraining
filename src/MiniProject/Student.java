package MiniProject;

import java.io.*;
import java.util.*;

public class Student {
    static Scanner sc = new Scanner(System.in);

    static String criteria = "name";
    private  int id;
    private  String name;
    private  int age;
    private  String grade;
    private  String email;
    private static List<Student> list = new ArrayList<>();

    public Student(int id, String name, int age, String grade, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.email = email;
    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getGrade() {return grade;}

    public void setGrade(String grade) {this.grade = grade;}

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public static List<Student> getList() {return list;}

    public static void setList(List<Student> list) {Student.list = list;}

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + ", grade='" + grade + '\'' + ", email='" + email + '\'' + '}';
    }


    public  static void searchid() {
        try {
            System.out.println("Enter Id");
            int n = sc.nextInt();
            sc.nextLine();
            Optional<Student> student= Student.getList().stream().filter((sid) -> sid.getId() == n).findFirst();
            if(student.isPresent()){
                System.out.println(student.get());
            }
            else{
                System.out.println("No such id found");
            }

        } catch (Exception e) {
            System.out.println("Enter a valid id");
        }
    }

    public static void searchGrade() {
        try {
        System.out.println("Enter required Grade:");
        String searchName = sc.nextLine();
        List<Student> st = Student.getList()
                .stream()
                .filter(sn -> sn.getGrade().equalsIgnoreCase(searchName))
                .toList();

        if (!st.isEmpty()) {
            st.forEach(System.out::println);
        } else {
            System.out.println("No students found with grade " + searchName);
        }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }


    public static void updateid(){
        try {
            System.out.println("Enter id to Update");
            int updateid = sc.nextInt();
            sc.nextLine();
        for(Student stu : Student.getList()){
            if(stu.getId()==updateid){
                System.out.println("Enter Name : ");
                String name = sc.nextLine();
                System.out.println("Enter Age : ");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter Grade : ");
                String grad = sc.nextLine();
                System.out.println("Enter Email : ");
                String emails = sc.nextLine();
                stu.setName(name);
                stu.setAge(age);
                stu.setGrade(grad);
                stu.setEmail(emails);
            }
        }
        sortingdata(criteria);
        storeDataAsync();
        }catch (Exception e){
            System.out.println("Enter a valid Id");
        }
    }

    public static void deleteid(){
        try {
        int deleteingid = sc.nextInt();
        Student.getList().removeIf((id)->id.getId()==deleteingid);
    }
        catch (Exception e){
            System.out.println("Enter a valid id to delete");
        }
        sortingdata(criteria);
        storeDataAsync();
    }


    public static void storeDataAsync() {
        new Thread(() -> {
            try {
                storeData();
                System.out.println("Data stored successfully in background!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }


    public static void storeData() throws IOException {
        String FILE_NAME = "StudentsData.txt";
        FileWriter filewrite = new FileWriter(FILE_NAME);
        Student.getList().forEach((student -> {
            try{
                filewrite.write("ID :"+student.getId()+ "\n"+"Name : "+student.getName()+ "\n"+"Age : "+student.getAge()+ "\n"+"Grade : "+student.getGrade()+ "\n"+"Email : "+student.getEmail()+"\n\n");
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }));
        filewrite.close();
        sortingdata(criteria);
    }


    public static void readData() {
        File file = new File("StudentsData.txt");
        if (!file.exists()) {
            System.out.println("No existing records");
            return;
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;
                String nameLine = bufferedReader.readLine();
                String ageLine = bufferedReader.readLine();
                String gradeLine = bufferedReader.readLine();
                String emailLine = bufferedReader.readLine();
                if (nameLine == null || ageLine == null || gradeLine == null || emailLine == null) {
                    System.out.println("Incomplete record found, skipping...");
                    break;
                }
                int id = Integer.parseInt(line.split(":")[1].trim());
                String name = nameLine.split(":")[1].trim();
                int age = Integer.parseInt(ageLine.split(":")[1].trim());
                String grade = gradeLine.split(":")[1].trim();
                String email = emailLine.split(":")[1].trim();
                boolean exists = false;
                for (Student s : list) {
                    if (s.getId() == id && s.getName().equals(name) && s.getAge() == age &&
                            s.getGrade().equals(grade) && s.getEmail().equals(email)) {
                        exists = true;
                        break;
                    }
                }
                if (!exists) {
                    Student student = new Student(id, name, age, grade, email);
                    list.add(student);
                }
                bufferedReader.mark(1);
                if (bufferedReader.read() != '\n') {
                    bufferedReader.reset();
                }
            }
        } catch (IOException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("Students stored: " + list.size());
        for (Student s : list) {
            System.out.println(s);
        }
    }


    public static void add_data() {
        try {
            System.out.println("Enter ID: ");
            int ids = sc.nextInt();
            sc.nextLine();

            Optional<Student> stud = Student.getList().stream()
                    .filter(student -> student.getId() == ids)
                    .findFirst();
            if (stud.isPresent()) {
                System.out.println("Student ID already exists: " + stud.get());
                return;
            }

            System.out.println("Enter Name: ");
            String name = sc.next();
            sc.nextLine();

            int age = 0;
            boolean isValidAge = false;
            while (!isValidAge) {
                try {
                    System.out.println("Enter Age: ");
                    age = sc.nextInt();
                    if (age < 50) {
                        isValidAge = true;
                    } else {
                        System.out.println("Invalid Age. Age must be less than 50.");
                    }
                } catch (Exception e) {
                    System.out.println("Please enter a valid number for age.");
                    sc.next();
                }
            }

            String grade = "";
            boolean isValidGrade = false;
            while (!isValidGrade) {
                System.out.println("Enter Grade: ");
                grade = sc.next();
                if (grade.length() <= 2) {
                    isValidGrade = true;
                } else {
                    System.out.println("Invalid Grade. Grade must be 2 characters or fewer.");
                }
            }

            String email = "";
            boolean isValidEmail = false;
            while (!isValidEmail) {
                System.out.println("Enter Email: ");
                email = sc.next();
                String regex = "^[A-Za-z0-9]+([.-_][A-Za-z0-9]+)*@[A-Za-z0-9.-]+\\.(com|org|net)$";
                if (email.matches(regex)) {
                    isValidEmail = true;
                } else {
                    System.out.println("Invalid Email. Please enter a valid email.");
                }
            }

            sortingdata(criteria);
            storeDataAsync();

            Student.getList().add(new Student(ids, name, age, grade, email));
            System.out.println("Student data added successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void sortingdata(String criteria){
            if ("name".equalsIgnoreCase(criteria)) {
                Student.getList().sort(Comparator.comparing(Student::getName));
            } else if ("age".equalsIgnoreCase(criteria)) {
                Student.getList().sort(Comparator.comparing(Student::getAge));
            } else {
                Student.getList().sort(Comparator.comparing(Student::getId));
            }
    }
}


