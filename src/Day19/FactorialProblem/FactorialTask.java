package Day19.FactorialProblem;

import java.util.concurrent.Callable;

public class FactorialTask implements Callable<Long> {
    private final int number;

    public FactorialTask(int number) {
        this.number = number;
    }

    @Override
    public Long call() throws Exception {
        return factorial(number);
    }

    private Long factorial(int n) {
        if (n == 0) {
            return 1L;
        }
        return n * factorial(n - 1);
    }
}