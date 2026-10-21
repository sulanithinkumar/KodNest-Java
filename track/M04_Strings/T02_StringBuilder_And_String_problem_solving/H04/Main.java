
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        char replacement = scanner.nextLine().charAt(0);

        StringBuilder sbr = new StringBuilder(text);

        sbr.setCharAt(0, replacement);

        System.out.println("Result: " + sbr);
    }
}
