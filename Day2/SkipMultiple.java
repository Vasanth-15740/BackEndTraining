package Day2;
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
