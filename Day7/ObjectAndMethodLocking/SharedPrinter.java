//Object and method locking
//Write a Java program to demonstrate object-level and method-level locking using multithreading. The program should:
//Create a shared resource class (e.g., SharedPrinter) with two synchronized methods:
//Method 1: Print a given string multiple times.
//Method 2: Print a countdown from a given number.
//Use two threads:
//Thread 1: Calls the first synchronized method (print string).
//Thread 2: Calls the second synchronized method (countdown).
//Demonstrate the difference between:
//Object-Level Locking: When both threads use the same instance of the shared resource.
//Class-Level Locking: When both threads use a static synchronized method or block.
//Show how the locks affect the execution order of the methods.

package Day7.ObjectAndMethodLocking;
class SharedPrinter {

    public synchronized void printString(String str) {
        for (int i = 0; i < 5; i++) {
            System.out.println(str);
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }
    public synchronized void countdown(int num) {
        for (int i = num; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }

    public static synchronized void staticPrintString(String str) {
        for (int i = 0; i < 5; i++) {
            System.out.println(str);
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }
    public static synchronized void staticCountdown(int num) {
        for (int i = num; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }

    public static void main(String[] args) {
        SharedPrinter sharedPrinter = new SharedPrinter();
        Thread thread1 = new Thread(() -> sharedPrinter.printString("Hello"));
        Thread thread2 = new Thread(() -> sharedPrinter.countdown(5));
        thread1.start();
        thread2.start();
        try {
            thread2.join();
            thread1.join();

        } catch (Exception e) {

        }
        Thread thread3 = new Thread(() -> SharedPrinter.staticPrintString("World"));
        Thread thread4 = new Thread(() -> SharedPrinter.staticCountdown(5));
        thread3.start();
        thread4.start();

        try{
            thread3.join();
            thread4.join();
        }

        catch (Exception e){

        }
    }
}