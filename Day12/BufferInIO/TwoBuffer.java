package Day12.BufferInIO;

import java.nio.CharBuffer;
import java.nio.IntBuffer;

public class TwoBuffer {
    public static void main(String[] args) {
        CharBuffer charBuffer = CharBuffer.allocate(8);
        String input = "Vasanth";
        System.out.println("=== CharBuffer Example ===");
        for (int i = 0; i < input.length(); i++) {
            charBuffer.put(input.charAt(i));
        }
        charBuffer.flip();
        System.out.print("CharBuffer contents: ");
        while (charBuffer.hasRemaining()) {
            System.out.print(charBuffer.get());
        }
        System.out.println();


        IntBuffer intBuffer = IntBuffer.allocate(5);
        int[] numbers = {10, 20, 30, 40, 50};
        for (int number : numbers) {
            intBuffer.put(number);
        }
        intBuffer.flip();
        System.out.print("IntBuffer contents: ");
        while (intBuffer.hasRemaining()) {
            System.out.print(intBuffer.get() + " ");
        }
        System.out.println();
    }
}
