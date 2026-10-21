
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String baseText = scanner.nextLine();
        String prefix = scanner.nextLine();

        StringBuilder sbr = new StringBuilder(baseText);

        sbr.insert(0, prefix + ' ');
        System.out.println("Result: " + sbr);

    }
}
