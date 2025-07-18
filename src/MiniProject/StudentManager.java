package MiniProject;
import java.util.Scanner;
import static MiniProject.Student.storeDataAsync;

public class StudentManager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("1.Retrive Stored Records ");
            System.out.println("2.Add Data ");
            System.out.println("3.Update Details ");
            System.out.println("4.Delete Records ");
            System.out.println("5.Store Records ");
            System.out.println("6.Search By Student Id");
            System.out.println("7.Exit");
            System.out.println("Enter The Operation to Perform : ");
            int selectoption = sc.nextInt();
            switch (selectoption){

                case 1 :
                    Student.readData();
                    System.out.println();
                    break;

                case 2:
                    Student.add_data();
                    break;

                case 3 :
                    Student.updateid();
                    break;

                case 4:
                    System.out.println("Enter id to Delete");
                    Student.deleteid();
                    break;

                case 5:
                    storeDataAsync();
                    System.out.println("Stored the data successfully");
                    System.out.println();
                    break;

                case 6 :
                    System.out.println("Enter Method of Search \n1.Using Id \n2.Using Grade: ");
                    int n = sc.nextInt();
                    if (n==1)
                        Student.searchid();
                    else if(n==2)
                        Student.searchGrade();
                    break;

                case 7 :
                    System.exit(0);
                    break;
            }
        }
    }
}
