
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read n
        long n = scanner.nextLong();

        // Calculate expected sum of numbers from 1 to n: n * (n + 1) / 2
        long expectedSum = n * (n + 1) / 2;

        // Read the n - 1 elements and calculate their sum
        long actualSum = 0;
        for (int i = 0; i < n - 1; i++) {
            actualSum += scanner.nextLong();
        }

        // The missing number is the difference between the expected and actual sum
        long missingNumber = expectedSum - actualSum;

        // Print the missing value
        System.out.println(missingNumber);

        scanner.close();
    }
}
