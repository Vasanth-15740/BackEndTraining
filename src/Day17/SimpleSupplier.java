<<<<<<< HEAD
package Day17;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SimpleSupplier {
    public static void main(String[] args) {
        Supplier<LocalDateTime> dateTimeSupplier = ()-> LocalDateTime.now();
        System.out.println("Current Date and Time: " + dateTimeSupplier.get());
    }
=======
package Day17;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SimpleSupplier {
    public static void main(String[] args) {
        Supplier<LocalDateTime> dateTimeSupplier = ()-> LocalDateTime.now();
        System.out.println("Current Date and Time: " + dateTimeSupplier.get());
    }
>>>>>>> fd0363781432da3515f6f09997b0fa2620d40b76
}