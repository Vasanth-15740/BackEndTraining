//Create a program that allows the user to manage a shopping list using an ArrayList.
//Implement the following features:
//Add items to the shopping list.
//Remove an item from the list.
//Display the shopping list.

package Day9;

import java.util.ArrayList;

public class ManageShoppingList {
    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<>();
        ar.add("Milk");
        ar.add("Eggs");
        ar.add("Bread");
        ar.add("Butter");
        if (ar.contains("Eggs")){
            int n = ar.indexOf("Eggs");
            ar.remove(n);
        }
        System.out.println("Shopping List : ");
        for (int i = 0; i < ar.size(); i++) {
            System.out.print(ar.get(i) +",");
        }
    }

}
