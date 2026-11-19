
import java.util.Scanner;

class Activity implements Runnable {

    @Override
    public void run() {

        String threadName = Thread.currentThread().getName();

        if (threadName.equals("ADD")) {
            addition();
        } else if (threadName.equals("NUM")) {
            PrintingNum();
        } else {
            PrintingChar();
        }

    }

    void addition() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Addition activity started...");

        System.out.println("Enter a: ");
        int a = scan.nextInt();
        System.out.println("Enter b: ");
        int b = scan.nextInt();

        int res = a + b;
        System.out.println("Result of additon is: " + res);

        System.out.println("Addition activity completed...");

    }

    void PrintingNum() {
        System.out.println("Printing num activity started...");

        for (int i = 1; i <= 5; i++) {

            System.out.println(i);

            try {
                Thread.sleep(1000);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("Printing num activity completed...");

    }

    void PrintingChar() {

        System.out.println("Printing char activity started...");

        for (char i = 'A'; i <= 'M'; i++) {
            System.out.println(i);

            try {
                Thread.sleep(1000);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Printing char activity completed...");

    }
}
