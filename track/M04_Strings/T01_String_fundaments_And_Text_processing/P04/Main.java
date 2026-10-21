
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();
        String keyword = scanner.nextLine();

        // Normalize both values and search for the keyword.
        sentence = sentence.trim();
        sentence = sentence.toLowerCase();
        System.out.println("Normalized text: ".concat(sentence));
        System.out.println("Contains keyword: " + sentence.contains(keyword.toLowerCase()));
    }
}
