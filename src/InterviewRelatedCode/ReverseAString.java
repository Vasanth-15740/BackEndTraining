package InterviewRelatedCode;

public class ReverseAString {
    public static void main(String[] args) {
        String st = "java i have new";
        String[] s = st.split(" ");
        for (int i = s.length-1; i>=0 ; i--){
            System.out.println(s[i]);
        }
    }

}
