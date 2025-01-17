package Day7.ExtraProblems;

import java.util.Scanner;

public class StringPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = "abc";
        String [] Pattern ={"a","abc","bc","d"};
//        for(int i = 0; i < Pattern.length ; i++) {
//            Pattern[i]=sc.nextLine();
//        }
        int count=0;
        for(int i = 0; i < Pattern.length ; i++) {
            String str2 = Pattern[i];
            if(word.contains(str2)){
                count++;
            }
        }
        System.out.println(count);
    }
}
