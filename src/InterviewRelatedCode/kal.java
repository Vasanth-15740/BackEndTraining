package InterviewRelatedCode;

import java.util.Optional;

class OverRiding {
    void major(){
        System.out.println("asddss");
    }
}
class Riding extends OverRiding{
    void major(){
        System.out.println("aasdfds");
    }
}
public class kal{
    public static void main(String[] args) {
        OverRiding r = new OverRiding();
        Riding rd = new Riding();
        r.major();
        rd.major();
    }
}
