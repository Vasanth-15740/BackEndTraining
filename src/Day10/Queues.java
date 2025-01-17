package Day10;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queues {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            queue.add(sc.nextLine());
        }
        System.out.println("Serving:"+queue.poll());
        System.out.println("Waring:"+queue);
    }
}