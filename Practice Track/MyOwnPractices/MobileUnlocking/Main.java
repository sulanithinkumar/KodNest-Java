
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ScreenLock sl = new ScreenLock();

        System.out.println("1.Password Unlocking");
        System.out.println("2.PIN Unlocking");
        System.out.println("3.Pattern Unlocking");
        System.out.println("4.Face Unlocking");
        System.out.println("5.Finger Print Unlocking \n");
        System.out.println("Enter your Choice: ");
        int choice = scan.nextInt();
        scan.nextLine();

        switch (choice) {

            case 1:
                System.out.println("Enter Your Password");
                String password = scan.nextLine();
                sl.unlocking(password);
                break;

            case 2:
                System.out.println("Enter Your PIN");
                int pin = scan.nextInt();
                sl.unlocking(pin);
                break;

            case 3:
                Pattern p = new Pattern();
                sl.unlocking(p);

        }

    }
}
