<<<<<<< HEAD
package Day17;

import java.util.function.DoubleFunction;

public class StaticMethodReference {
    public static void main(String[] args) {
        DoubleFunction<Double> d = Math::sqrt;
        System.out.println(d.apply(4));
    }
}
=======
package Day17;

import java.util.function.DoubleFunction;

public class StaticMethodReference {
    public static void main(String[] args) {
        DoubleFunction<Double> d = Math::sqrt;
        System.out.println(d.apply(4));
    }
}
>>>>>>> fd0363781432da3515f6f09997b0fa2620d40b76
