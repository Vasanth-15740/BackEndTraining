
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

