
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Queue<Integer> q = new ArrayDeque<>();

        System.out.println("Enter values: ");
        for (int i = 0; i < 5; i++) {
            q.offer(scan.nextInt());

        }
        System.out.println(q.size());
        System.out.println(q.peek());
        q.poll();
        System.out.println(q.size());
        System.out.println(q.peek());

    }
}
