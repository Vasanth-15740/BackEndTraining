package Day10;
import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        HashMap<String,Integer>hashMap=new HashMap<>();
        hashMap.put("Alice",85);
        hashMap.put("Bob",90);
        hashMap.put("Charlie",88);
        System.out.println(hashMap);
        hashMap.replace("Bob",92);
        System.out.println(hashMap);
        System.out.println("Alice Grade is:"+hashMap.get("Alice"));
        System.out.println("All Student Grade");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
