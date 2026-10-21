
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String learnerName = scanner.nextLine();
        String courseName = scanner.nextLine();

        StringBuilder builder = new StringBuilder();

        builder.append("Learner: ");
        builder.append(learnerName);
        builder.append(" | Course: ");
        builder.append(courseName);

        System.out.println(builder);
    }
}
