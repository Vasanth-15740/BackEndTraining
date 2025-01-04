package Day6.LangObject;

public class JavaLangObject {
    public int n;
    public String s;

    public JavaLangObject(int n ,String s){
        this.n=n;
        this.s=s;
    }

    @Override
    public String toString(){
        return " value of n: "+ n +" \n String data: "+s;
    }

    public static void main(String[] args) {
        JavaLangObject Ob = new JavaLangObject(25,"Vasanth");
        System.out.println(Ob);
        System.out.println(Ob.getClass());
    }
}
