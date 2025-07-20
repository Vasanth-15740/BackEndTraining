package InterviewRelatedCode;

public class overloading {
    void major(int i ){
        System.out.println(i);
    }
    void major(double j){
        System.out.println(j);
    }
    public static void main(String[] args) {
        overloading vs = new overloading();
        vs.major(2);
        vs.major(4.234);
    }
}
