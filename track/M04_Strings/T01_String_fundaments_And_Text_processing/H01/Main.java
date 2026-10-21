
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read and display the course and trainer names.
        String courseName = scanner.nextLine();
        String trainerName = scanner.nextLine();

        System.out.println("Course: ".concat(courseName));
        System.out.println("Trainer: ".concat(trainerName));
    }
}
