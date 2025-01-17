package Self;

import java.util.HashMap;

public class HashMapImplementation {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("Alice",85);
        hm.put("Bob",90);
        hm.put("Charlie",88);
        System.out.println("Alice Grade : "+hm.get("Alice"));
        hm.replace("Bob",92);
        System.out.println("All Grades");
        
        for (HashMap.Entry<String,Integer> hr : hm.entrySet()){
            System.out.println(hr.getKey() +":"+hr.getValue());
        }
    }
}
