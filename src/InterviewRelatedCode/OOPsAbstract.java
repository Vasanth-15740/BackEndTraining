package InterviewRelatedCode;

abstract class major{
    abstract void state();
}
class minor extends major{

    @Override
    void state() {
        System.out.println("abstract methods");
    }
}
public class OOPsAbstract {
    public static void main(String[] args) {
        minor vs =new minor();
        vs.state();
    }
}
