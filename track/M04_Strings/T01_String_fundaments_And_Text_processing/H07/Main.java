
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String original = scanner.nextLine();

        // Create a lowercase copy and display both values.
        System.out.println("Original: " + original);
        System.out.println("Lowercase copy: " + original.toLowerCase());
    }
}
