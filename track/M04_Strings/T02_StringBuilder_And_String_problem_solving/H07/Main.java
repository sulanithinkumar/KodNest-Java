
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        StringBuilder builder = new StringBuilder(word);
        builder.reverse();

        System.out.println("Palindrome: " + builder.toString().equalsIgnoreCase(word));
    }
}
