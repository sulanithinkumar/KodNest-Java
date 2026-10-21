
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        int vowelCount = 0;

        // Traverse the text and update vowelCount.
        for (int i = 0; i < text.length(); i++) {
            char current = Character.toLowerCase(text.charAt(i));

            if (current == 'a' || current == 'e' || current == 'i' || current == 'o' || current == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Vowels: " + vowelCount);
    }
}
