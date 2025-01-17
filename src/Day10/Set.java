package Day10;

import java.util.HashSet;
public class Set {
    public static void main(String[] args) {
        HashSet<String>ll=new HashSet<>();
        ll.add("Alice");
        ll.add("Bob");
        ll.add("Alice");
        ll.add("Eve");
        ll.add("Charlie");
        System.out.println("Unique Name is:");
        System.out.println(ll);
    }
}
