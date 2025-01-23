<<<<<<< HEAD
package Day17;
import java.util.Optional;
public class OptionalWithDefault {
    public static void main(String[] args) {
        String name = null;
        Optional<String> optionalName = Optional.ofNullable(name);
        String result = optionalName.orElse("Guest");
        System.out.println("Name: " + result);
        }
}
=======
package Day17;
import java.util.Optional;
public class OptionalWithDefault {
    public static void main(String[] args) {
        String name = null;
        Optional<String> optionalName = Optional.ofNullable(name);
        String result = optionalName.orElse("Guest");
        System.out.println("Name: " + result);
        }
}
>>>>>>> fd0363781432da3515f6f09997b0fa2620d40b76
