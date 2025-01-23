<<<<<<< HEAD
package Day17;
import java.util.Optional;

public class HnadlingNullException {
    public static void main(String[] args) {
        String st = null;
        Optional<String> optionalInput = Optional.ofNullable(st);
        String result = optionalInput.map(s -> s == null ? null : s.toUpperCase()).orElse("Empty input");
        System.out.println(result);
    }
}
=======
package Day17;
import java.util.Optional;

public class HnadlingNullException {
    public static void main(String[] args) {
        String st = null;
        Optional<String> optionalInput = Optional.ofNullable(st);
        String result = optionalInput.map(s -> s == null ? null : s.toUpperCase()).orElse("Empty input");
        System.out.println(result);
    }
}
>>>>>>> fd0363781432da3515f6f09997b0fa2620d40b76
