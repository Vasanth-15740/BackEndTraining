//Write a program to print all numbers from 1 to 100, skipping multiples of 5 (use continue).

package Day2.ProgramControl1;
public class SkipMultiple {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if(i%5==0){
                continue;
            }
            else {
                System.out.println(i);
            }

        }
    }
}
