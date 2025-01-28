package Day19;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {
    public static void main(String[] args) {
        CompletableFuture<String> userDataFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "User Data";
        });

        CompletableFuture<String> userOrdersFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "User Orders";
        });

        CompletableFuture<String> combinedFuture = userDataFuture.thenCombine(userOrdersFuture, (userData, userOrders) -> {
            return userData + " and " + userOrders;
        });

        try {
            String result = combinedFuture.get();
            System.out.println("Combined Result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}