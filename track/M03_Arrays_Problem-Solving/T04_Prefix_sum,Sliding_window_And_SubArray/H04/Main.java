
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

        long target = scanner.nextLong();
        scanner.close();

        int left = 0;
        long currentSum = 0;

        for (int right = 0; right < n; right++) {
            currentSum += arr[right];

            // Shrink the window from the left while currentSum exceeds target
            // and the window is non-empty (left <= right)
            while (currentSum > target && left <= right) {
                currentSum -= arr[left];
                left++;
            }

            // Check if we found the target sum
            if (currentSum == target) {
                System.out.println(left + " " + right);
                return;
            }
        }

        // If no such subarray exists
        System.out.println(-1);
    }
}
