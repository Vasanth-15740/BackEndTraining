//Transform a List of Names.
//Write a method that takes a list of student names and transforms each name into uppercase letters
//with a prefix like "Student: " using map.

package Day15;
import java.util.*;
import java.util.stream.Collectors;

public class TransformListName {
    public static List<String> transformNames(List<String> names) {
        return names.stream()
                .map(name -> "Student: " + name.toUpperCase())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");

        List<String> transformedNames = transformNames(names);

        transformedNames.forEach(System.out::println);
    }
}

