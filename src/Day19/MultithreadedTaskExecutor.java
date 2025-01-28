package Day19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultithreadedTaskExecutor {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 1; i <= 10; i++) {
            int taskNumber = i;
            executor.submit(() -> {
                System.out.println("Task " + taskNumber + " is executed by " + Thread.currentThread().getName());
            });
        }
        executor.shutdown();
    }
}