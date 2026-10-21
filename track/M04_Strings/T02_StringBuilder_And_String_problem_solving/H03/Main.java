
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        StringBuilder sbr = new StringBuilder(text);

        sbr.deleteCharAt(sbr.length() - 1);

        System.out.println("Result: " + sbr);
    }
}
