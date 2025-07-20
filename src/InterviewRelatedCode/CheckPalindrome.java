package InterviewRelatedCode;

public class CheckPalindrome {
    public static void main(String[] args) {
        String st = "madam";
        int j = st.length()-1;
        String sl = "palindrome";
        for(int i = 0;i<st.length()-1;i++){
            if(st.charAt(i)!=st.charAt(j)){
                sl =" Not palindrome";
            }
            j--;
        }
        System.out.println(sl);
    }
}
