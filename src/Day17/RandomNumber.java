<<<<<<< HEAD
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
=======
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
>>>>>>> fd0363781432da3515f6f09997b0fa2620d40b76
