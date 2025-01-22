package Day16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterEvenNumbers {
    public FilterEvenNumbers(){
        List<Integer> l = new ArrayList<>();
        l.add(12);
        l.add(45);
        l.add(26);
        l.add(35);
        l.add(60);
        System.out.println("Actual Input : "+l);
        Prediction(l,(i)->i%2==0);
    }

    public void Prediction(List<Integer> l, Predicate<Integer> predicate){
        List<Integer> l2 = new ArrayList<>();
        for( Integer i :l){
            if (predicate.test(i)){
                l2.add(i);
            }
        }
        System.out.println("EvenNumbers : 1" +l2);
    }

    public static void main(String[] args) {
        FilterEvenNumbers n = new FilterEvenNumbers();

    }
}