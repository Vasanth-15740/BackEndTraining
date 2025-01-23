package Day17;

import java.util.ArrayList;
import java.util.List;

public class InstanceMethodReference {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Vasanth","Anitha","Ankitha","Jarnun","zatura"));
        list.sort(String::compareToIgnoreCase);
        System.out.println(list);
    }
}
