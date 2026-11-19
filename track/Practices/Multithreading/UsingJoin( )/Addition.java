
import java.util.Scanner;

class Addition extends Thread {

    @Override
    public void run() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Addition activity started and using the file");

        System.out.println("Enter A: ");
        int a = scan.nextInt();
        System.out.println("Enter B: ");
        int b = scan.nextInt();

        int res = a + b;
        System.out.println("Addition result: " + res);

        System.out.println("Addition activity completed and stopped using the file");

    }
}
