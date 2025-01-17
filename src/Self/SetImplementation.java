package Self;

import java.util.HashSet;

public class SetImplementation {
    public static void main(String[] args) {
        HashSet<String> sr = new HashSet<String>();
        sr.add("Alice");
        sr.add("Bob");
        sr.add("Charlie");
        sr.add("Eve");
        sr.add("Charlie");

        System.out.println(sr);
    }
}
