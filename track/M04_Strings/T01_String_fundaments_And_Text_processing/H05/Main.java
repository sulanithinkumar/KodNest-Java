
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String learnerName = scanner.nextLine();

        // Normalize and display the name.
        System.out.println("Normalized name: " + learnerName.toUpperCase().trim());
    }
}
