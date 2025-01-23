package Day17;
import java.util.function.BinaryOperator;
public class BinaryOperatorMax {
        public static void main(String[] args) {
            BinaryOperator<Integer> maxOperator = (a, b) -> a > b ? a : b;
            int num1 = 10;
            int num2 = 20;
            int result = maxOperator.apply(num1, num2);
            System.out.println(result);
        }
}
