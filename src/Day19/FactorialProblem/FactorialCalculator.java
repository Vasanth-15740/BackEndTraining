package Day19.FactorialProblem;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FactorialCalculator {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        FactorialTask task = new FactorialTask(5);
        Future<Long> future = executor.submit(task);

        try {
            Long result = future.get();
            System.out.println("Factorial is: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}