
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        // Create the reversed word and compare it.
        StringBuilder sbr = new StringBuilder(word);

        sbr = sbr.reverse();

        System.out.println("Reversed: " + sbr);

        System.out.println("Palindrome: " + sbr.toString().equalsIgnoreCase(word));
    }
}
