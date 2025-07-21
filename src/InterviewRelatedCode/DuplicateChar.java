package InterviewRelatedCode;

public class DuplicateChar{
    public static void main(String[] args) {
        String st = "java new i have";
        char ch=97;
        for (int i = 0; i< 26; i++) {
            int count=0;
            for (int j = 0; j <st.length() ; j++) {
                if(st.charAt(j)==ch){
                    count++;
                }
            }
            if(count>1){
                System.out.println(ch+" "+count);
            }
            ch++;
        }
    }
}