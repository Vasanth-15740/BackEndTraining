
package Day17;

import java.util.Random;
import java.util.function.Supplier;

public class RandomNumber {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
        Supplier<Integer> s = ()->new Random().nextInt(100);
        System.out.println(s.get());
        }
    }
}
