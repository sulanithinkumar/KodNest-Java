
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String learnerName = scanner.nextLine();

        StringBuilder sbr = new StringBuilder(learnerName);

        sbr.insert(0, "Hello, ");
        sbr.append('!');

        System.out.println(sbr);
    }
}
