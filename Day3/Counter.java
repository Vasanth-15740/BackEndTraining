package Day3;

public class Counter {
    public static int count=0;
    public Counter(int var){
        count++;
    }
    public static void main(String[] args) {
        Counter obj1 = new Counter(5);
        Counter obj2 = new Counter(6);
        Counter obj3 = new Counter(8);
        System.out.println("var Added  "+count);
    }
}
