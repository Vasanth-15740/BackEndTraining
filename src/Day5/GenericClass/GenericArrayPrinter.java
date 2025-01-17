package Day5.GenericClass;

public class GenericArrayPrinter {

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        String[] stringArray = {"Hello", "World", "Generic", "Method"};
        printArray(stringArray);

        Integer[] integerArray = {1, 2, 3, 4, 5};
        printArray(integerArray);

        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        printArray(doubleArray);
    }
}
