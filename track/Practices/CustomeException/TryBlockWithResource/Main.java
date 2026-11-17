
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter a: ");
            int a = scan.nextInt();
            System.out.println("You entered is " + a);
        }
    }
}
