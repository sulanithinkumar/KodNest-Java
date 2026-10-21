
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();
        String word = scanner.nextLine();

        // Search and display the result.
        System.out.println("Found: " + sentence.contains(word));
    }
}
