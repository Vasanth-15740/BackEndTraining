package Day13.Palindrom;

public class StringPalindrom {
    public boolean isPalindrom(String str) {
        String str1 = str.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(str1).reverse().toString();
        return str1.equals(reversed);
    }
}
