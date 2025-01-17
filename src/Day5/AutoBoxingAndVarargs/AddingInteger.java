package Day5.AutoBoxingAndVarargs;

import java.util.ArrayList;
import java.util.List;

public class AddingInteger {
    public static void main(String[] args) {
        List<Integer> Value = new ArrayList<>();
        Value.add(56);
        Value.add(78);
        Value.add(90);
        Value.add(45);
        Value.add(23);
        int sum=0;
        for(int i = 0; i < Value.size(); i++) {
            sum+=Value.get(i);
        }
        System.out.println(sum);
    }
}
