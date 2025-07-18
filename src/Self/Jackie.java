public interface Jackie {
    default void bot (){
        System.out.println("sdvsdv");
    }
}
class Jackie1 implements Jackie{

}

public void main(String[] args) {
    Jackie a= new Jackie1 ();
    a.bot();
}
