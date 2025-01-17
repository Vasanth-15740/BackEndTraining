package Day5.GenericClass;

public class Pair<K,V> {
    K key;
    V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>("One", 1);
        Pair<String, String> p2 = new Pair<>("Two", "Two");
        System.out.println( p1.key +" " + p1.value);
        System.out.println( p2.key +" " + p2.value);
    }
}