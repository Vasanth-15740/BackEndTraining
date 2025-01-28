package Day19;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ParalleStream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList(List.of(10,56,45,75,3,45,75,345,643,657));
        List<Integer> l2 = list.stream().parallel().filter(n->n>50).map(n->n*n).limit(10).collect(Collectors.toList());
        l2.forEach(System.out::println);
    }
}
