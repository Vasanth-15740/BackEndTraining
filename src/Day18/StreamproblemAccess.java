package Day18;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamproblemAccess {
    public static void main(String[] args) {
        List<StreamProblem> list = new ArrayList<>();
        list.add(new StreamProblem("Vasanth", Arrays.asList(34, 56, 78, 45, 23), "computerScience"));
        list.add(new StreamProblem("Nithish", Arrays.asList(64, 96, 89, 48, 27), "Mathematics"));
        list.add(new StreamProblem("Dhanush", Arrays.asList(78, 86, 78, 25, 53), "Physics"));
        list.add(new StreamProblem("Nisha", Arrays.asList(99, 79, 90, 89, 99), "Mathematics"));
        list.add(new StreamProblem("Bharathan", Arrays.asList(35, 60, 38, 47, 83), "computerScience"));

        List<StreamProblem> list1 = list.stream()
                .sorted((s1, s2) -> Double.compare(s2.AverageMarks(), s1.AverageMarks()))
                .limit(3)
                .collect(toList());
        list1.forEach((listlam) -> System.out.println(listlam.getName() + " " + listlam.AverageMarks()));

        System.out.println("---------------------------------------------------------");

        list.forEach((std)->std.calculateGrade());
        list.stream().collect(Collectors.groupingBy(StreamProblem::getDepartment,Collectors.averagingDouble(StreamProblem::AverageMarks)))
                .forEach((department,avg)-> System.out.println(department+" "+avg));

        System.out.println("---------------------------------------------------------");

        list.stream().collect(Collectors.groupingBy(StreamProblem::getDepartment,Collectors.maxBy(Comparator.comparingDouble(StreamProblem::AverageMarks))))
                .forEach((depart,stu)-> System.out.println(depart+" "+stu.get().getName()));

        System.out.println("---------------------------------------------------------");

        list.stream().filter((stud)->stud.AverageMarks()<50).collect(Collectors.groupingBy(StreamProblem::getDepartment,Collectors.counting()))
                .forEach((department,fail)-> System.out.println(department+" : "+fail));
    }
}