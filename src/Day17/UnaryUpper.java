package Day17;
import java.util.function.UnaryOperator;

public class UnaryUpper {
        public static void main(String[] args) {
            UnaryOperator<String> toUpperCase = (s)-> s.toUpperCase();
            String st = "hello world";
            String result = toUpperCase.apply(st);
            System.out.println("Uppercase: " + result);
        }
}
