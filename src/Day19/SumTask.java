package Day19;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class SumTask extends RecursiveTask<Long> {
    private static final int THRESHOLD = 1000;
    int start;
    int end;

    public SumTask(int start ,int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        if(end - start <= THRESHOLD) {
            long sum = 0;
            for(int i = start; i <= end; i++) {
                sum += i;
            }
            return sum;
        }
        else {
            int mid = (start + end) / 2;
            SumTask left = new SumTask(start, mid);
            SumTask right = new SumTask(mid + 1, end);
            left.fork();
            long rightResult = right.compute();
            long leftResult = left.join();
            return leftResult + rightResult;
        }
    }

    public static void main(String[] args) {
        ForkJoinPool pool =new ForkJoinPool();
        SumTask sum = new SumTask(1,1000000);
        long result = pool.invoke(sum);
        System.out.println(result);
        
    }


}
