
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        System.out.println("Connection Established");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the num1: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the num2: ");
        int num2 = scanner.nextInt();

        try {
            int res = num1 / num2;
            System.out.println("Result: " + res);

        } catch (Exception e) {

            System.out.println(e.getMessage());
            System.out.println("Exception handled");
        }
        System.out.println("Connection terminated");

    }
}
