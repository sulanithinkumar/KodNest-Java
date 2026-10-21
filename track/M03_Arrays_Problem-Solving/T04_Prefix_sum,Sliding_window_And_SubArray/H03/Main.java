
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();
        scanner.close();

        if (k > n || k <= 0) {
            return;
        }

        // Compute the sum of the first window of size k
        long currentWindowSum = 0;
        for (int i = 0; i < k; i++) {
            currentWindowSum += arr[i];
        }

        long minSum = currentWindowSum;

        // Slide the window across the rest of the array
        for (int i = k; i < n; i++) {
            currentWindowSum = currentWindowSum - arr[i - k] + arr[i];
            if (currentWindowSum < minSum) {
                minSum = currentWindowSum;
            }
        }

        System.out.println(minSum);
    }
}
