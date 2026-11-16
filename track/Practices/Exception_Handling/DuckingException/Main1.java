
import java.util.Scanner;

class Main1 {

    public static void main(String[] args) {
        System.out.println("Main method execution started");
        try {
            divide();
        } catch (Exception e) {
            System.out.println("Exception handled in main method");
        }
        System.out.println("Main method execution completed");
    }

    static void divide() throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scan.nextInt();
        System.out.println("Enter b: ");
        int b = scan.nextInt();
        int res = a / b;
        System.out.println("Result: " + res);
    }
}
