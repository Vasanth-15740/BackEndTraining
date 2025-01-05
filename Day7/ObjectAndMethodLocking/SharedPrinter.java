package Day7.ObjectAndMethodLocking;

public class SharedPrinter extends Thread{
    synchronized void StringPrint(String str){
        for (int i = 0; i < 5; i++) {
            System.out.println("Given String"+str);
        }
        try{
            Thread.sleep(500);
        }
        catch (Exception e){
        }
    }

    synchronized void CoutPrint(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("count down :" + i);
        }
        try {
            Thread.sleep(500);
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        SharedPrinter sp =new SharedPrinter();
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        t1.start();
        t2.start();
    }
}
