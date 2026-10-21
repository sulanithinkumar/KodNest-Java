
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        StringBuilder sbr = new StringBuilder(word);

        System.out.println("Reversed: " + sbr.reverse());
    }
}
