
import java.util.Scanner;

class PracticeTask {

    int id;

}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PracticeTask p1 = new PracticeTask();
        System.out.println("Enter ID: ");
        p1.id = scanner.nextInt();

        PracticeTask p2 = new PracticeTask();
        System.out.println("Enter ID: ");
        p2.id = scanner.nextInt();

        PracticeTask p3 = new PracticeTask();
        System.out.println("Enter ID: ");
        p3.id = scanner.nextInt();

        int unreachableld = p1.id;

        PracticeTask relay = p1;

        p1 = p2;

        p2 = p3;

        relay = p2;

        p3 = p1;

        System.out.println("First Reference: " + p1.id);
        System.out.println("Second Reference: " + p2.id);
        System.out.println("Third Reference: " + p3.id);
        System.out.println("Relay Reference: " + relay.id);
        System.out.println("Unreachable Object: " + unreachableld);
    }
}
