
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        // Create a builder, reverse it and display the result.
        StringBuilder str = new StringBuilder(text);
        System.out.println("Reversed: " + str.reverse());
    }
}
