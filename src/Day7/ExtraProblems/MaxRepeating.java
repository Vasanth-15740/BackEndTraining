package Day7.ExtraProblems;

public class MaxRepeating {
    public static int maxRepeating(String sequence, String word) {
        int k = 0;
        String repeatedWord = word;

        while (sequence.contains(repeatedWord)) {
            k++;
            repeatedWord += word;
        }

        return k;
    }

    public static void main(String[] args) {

        String sequence1 = "ababc";
        String word1 = "ab";
        System.out.println(maxRepeating(sequence1, word1));

        String sequence2 = "ababc";
        String word2 = "ba";
        System.out.println(maxRepeating(sequence2, word2));
    }
}
