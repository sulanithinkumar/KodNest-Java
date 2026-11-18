
import java.util.Scanner;

class Addition implements Runnable {

    @Override
    public void run() {
        System.out.println("Addition activity started...");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = scan.nextInt();

        System.out.println("Enter b: ");
        int b = scan.nextInt();

        int res = a + b;
        System.out.println("Addition result is " + res);

        System.out.println("Addition activity completed...");

    }
}
