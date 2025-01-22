package Day16;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StartsWithLetter {

   StartsWithLetter() {
       List<String> list = new ArrayList<>();
       list.add("Apple");
       list.add("Banana");
       list.add("Avocado");
       list.add("Cherry");
       display(list,(s)->s.charAt(0)=='A'||s.charAt(0)=='a');
    }
    void display(List<String> list , Predicate<String> predicate){
       for(String s : list){
           if (predicate.test(s)){
               System.out.print(s+" ");
           }
       }
    }
    public static void main(String[] args) {
       StartsWithLetter s = new StartsWithLetter();
    }
}
