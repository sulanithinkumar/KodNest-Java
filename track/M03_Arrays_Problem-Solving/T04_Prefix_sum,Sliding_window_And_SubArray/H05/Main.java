
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }
        int n = scanner.nextInt();

        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }
        scanner.close();

        long currentSum = arr[0];
        long maxSum = arr[0];

        for (int i = 1; i < n; i++) {
            // Either extend the previous subarray or start a new one at arr[i]
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            // Keep track of the maximum sum found so far
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println(maxSum);
    }
}
