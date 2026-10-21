
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int repeatCount = Integer.parseInt(scanner.nextLine());

        StringBuilder builder = new StringBuilder();

        for (int i = 1; i <= repeatCount; i++) {
            builder.append(word);
        }

        System.out.println("Result: " + builder);
    }
}
