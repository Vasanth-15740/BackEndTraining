
package Day16;
import java.util.function.BiConsumer;

public class BiConsumerSum {
    public BiConsumerSum(){
        BiConsumer<Integer,Integer> bi = (a,b)-> System.out.println(a+b);
        bi.accept(3,5);
    }

    public static void main(String[] args) {
        BiConsumerSum s = new BiConsumerSum();
    }
}