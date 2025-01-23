package Day17;

import java.util.function.DoubleFunction;

public class StaticMethodReference {
    public static void main(String[] args) {
        DoubleFunction<Double> d = Math::sqrt;
        System.out.println(d.apply(4));
    }
}

