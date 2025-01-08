//Create a program to manage a contact directory using a Hashtable in Java. Implement the following functionalities:
//Add contacts with the name as the key and phone number as the value.
//Search for a contact by name and display their phone number.
//Remove a contact by name.
//Display all contacts in the directory.

package Day9;

import java.util.Hashtable;

public class ContactDirectory {
    public static void main(String[] args) {
        Hashtable<String,Integer> cd = new Hashtable<String,Integer>();
        System.out.println("Contact Directory:");
        cd.put("John" , 986543210);
        cd.put("Alice" , 923456780);
        cd.put("Bob" , 889776655);
        cd.put("Jacklin" , 927568731);
       for(String n :cd.keySet()){
           System.out.println(n+" "+cd.get(n));
       }


        System.out.println("Searching alice");
        if (cd.containsKey("Alice")){
            System.out.println(cd.get("Alice"));
        }

        cd.remove("Bob");

        System.out.println("After removal");
        for(String i : cd.keySet()){
            System.out.println(i+" "+cd.get(i));
        }

}
}
