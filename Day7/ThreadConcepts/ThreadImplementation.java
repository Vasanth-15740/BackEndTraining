package Day7.ThreadConcepts;

public class ThreadImplementation extends Thread{
    String s;

    public ThreadImplementation(String s)
    {
        this.s = s;
        start();
    }

    public void run(){
        if(s.equals("print")){
            for (int i = 1; i < 10 ; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        }
        else if(s.equals("Running")){
            for (int i = 1; i < 10; i++) {
                System.out.println(Math.pow(i,2));
                try {
                    Thread.sleep(700);
                } catch (Exception e) {
                }
            }
        }

    }
    public static void main(String[] args) {
        ThreadImplementation t = new ThreadImplementation("print");
        ThreadImplementation h = new ThreadImplementation("Running");
    }
}
