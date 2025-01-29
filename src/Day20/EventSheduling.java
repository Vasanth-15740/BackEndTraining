package Day20;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class EventSheduling {
    public static void main(String[] args) {
        List<Events> list = Arrays.asList(
                new Events("Meating", Duration.ofHours(2), LocalDateTime.of(2021, 10, 10, 10, 10)),
                new Events("workshop", Duration.ofHours(4), LocalDateTime.of(2021, 10, 11, 12, 10)),
                new Events("Conference", Duration.ofHours(4), LocalDateTime.of(2021, 10, 11, 14, 10))
        );

        System.out.println(" Display all events");
        list.forEach(System.out::println);

        System.out.println("----------------------------------------------------------------------------");

        list.stream().filter((date)->date.getDateandTime().getDayOfMonth() == 11).forEach(System.out::println);

        System.out.println("----------------------------------------------------------------------------");

        for (int i = 0; i < list.size()-1; i++) {
            Duration d = Duration.between(list.get(i).getDateandTime(), list.get(i+1).getDateandTime());
            System.out.println((d.toHours()));
        }
    }
}
