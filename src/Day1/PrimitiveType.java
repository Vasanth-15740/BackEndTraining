//Declare variables of all primitive types and print them.
//Convert a double to an int and print the result.

package Day1;
public class PrimitiveType {
    public static void main(String[] args) {
        byte b = 127;
        short sVar = 32000;
        int Var = 2147483647;
        long lVar = 9223372036854775807L;
        float fVar = 3.14f;
        double dVar = 3.14159;
        char cVar = 'A';
        boolean bo = true;
        System.out.println("byte: " + b);
        System.out.println("short: " + sVar);
        System.out.println("int: " + Var);
        System.out.println("long: " + lVar);
        System.out.println("float: " + fVar);
        System.out.println("double: " + dVar);
        System.out.println("char: " + cVar);
        System.out.println("boolean: " + bo);
        int convertedInt = (int) dVar;
        System.out.println("Converted double to int: " + convertedInt);
    }
}