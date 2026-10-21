
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }
        int n = scanner.nextInt();

        long[] arr = new long[n];
        long totalSum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
            totalSum += arr[i];
        }
        scanner.close();

        long leftSum = 0;

        for (int i = 0; i < n; i++) {
            // Right sum = totalSum - leftSum - arr[i]
            long rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                System.out.println(i);
                return;
            }

            leftSum += arr[i];
        }

        // If no equilibrium index is found
        System.out.println(-1);
    }
}
