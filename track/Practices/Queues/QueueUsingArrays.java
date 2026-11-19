
import java.util.Scanner;

class QueueUsingArrays {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter queue size: ");
        int queue[] = new int[scan.nextInt()];

        int front = 0;
        int rear = 0;

        System.out.println("Enter no of values in queue: ");
        int valuesInQueue = scan.nextInt();

        System.out.println("Enter values in queue: ");

        for (int i = 0; i < valuesInQueue; i++) {
            queue[rear++] = scan.nextInt();
        }

        System.out.println("front element: " + queue[front]);

        System.out.println("Queue size: " + (rear - front));

        front++;

        System.out.println("front element: " + queue[front]);

        System.out.println("Queue size: " + (rear - front));

        front++;

        System.out.println("front element: " + queue[front]);

        System.out.println("Queue size: " + (rear - front));
    }
}
