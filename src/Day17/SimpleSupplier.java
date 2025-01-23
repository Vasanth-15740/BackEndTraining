package Day17;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SimpleSupplier {
    public static void main(String[] args) {
        Supplier<LocalDateTime> dateTimeSupplier = ()-> LocalDateTime.now();
        System.out.println("Current Date and Time: " + dateTimeSupplier.get());
    }
}