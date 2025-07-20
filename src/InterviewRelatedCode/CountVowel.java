package InterviewRelatedCode;

public class CountVowel {
    public static void main(String[] args) {
        String s ="vasanth kumar";
        int count=0;
        int tount=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
                if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                    count++;
                }
                else {
                    tount++;
                }
            }
        }
        System.out.println(count+"vowels");
        System.out.println(tount+"consonents" );
    }
}
