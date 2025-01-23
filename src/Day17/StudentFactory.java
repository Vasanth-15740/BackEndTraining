package Day17;

public interface StudentFactory {
    ConRef passing(String name , int mark);
}
class ConRef{
    String name;
    int mark;

    public ConRef(String name , int mark){
        this.name=name;
        this.mark=mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return name= name + " " + mark ;
    }

    public static void main(String[] args) {
        StudentFactory stud = ConRef ::new;
        ConRef st = stud.passing("vasanth",54);
        ConRef f =stud.passing("arjun",45);
        System.out.println(st);
        System.out.println(f);
    }
}