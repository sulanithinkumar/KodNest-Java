
import java.util.Scanner;

class Main2 {

    public static void main(String[] args) throws Exception {
        System.out.println("Main method execution started");

        divide();

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
