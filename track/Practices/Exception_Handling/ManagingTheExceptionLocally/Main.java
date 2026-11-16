
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        System.out.println("Main method execution started");
        divide();
        System.out.println("Main method execution completed");

    }

    static void divide() {
        System.out.println("divide started");
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a: ");
        int a = scan.nextInt();
        System.out.println("enter b: ");
        int b = scan.nextInt();
        try {
            int res = a / b;
            System.out.println("result: " + res);
        } catch (Exception e) {
            System.out.println("Exception handled in divide method");
        }
        System.out.println("divide completed");
    }
}
