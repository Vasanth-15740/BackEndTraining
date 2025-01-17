//Create two interfaces Printer with a method print() and Scanner with a method scan(). Create a class AllInOne that implements both interfaces.

package Day3.Interface;
interface Printer{
    void print();
}
interface Scanner{
    void scan();
}
class AllInOne implements Printer,Scanner {
    public void print(){
        System.out.println("Printing");
    }
    public void scan(){
        System.out.println("Scanning");
    }
    public static void main(String[] args) {
        AllInOne a = new AllInOne();
        a.print();
        a.scan();
    }
}

