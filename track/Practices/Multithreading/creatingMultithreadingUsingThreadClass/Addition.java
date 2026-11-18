
import java.util.Scanner;

class Addition extends Thread {

    @Override
    public void run() {
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
}
