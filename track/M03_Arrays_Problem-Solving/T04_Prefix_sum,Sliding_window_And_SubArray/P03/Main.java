
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int n = scanner.nextInt();
        long[] arr = new long[n];

        // Read the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }

        // Build the prefix sum array
        long[] prefixSum = new long[n];
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        // Read the number of queries
        int q = scanner.nextInt();

        // Process each query
        for (int i = 0; i < q; i++) {
            int left = scanner.nextInt();
            int right = scanner.nextInt();

            long sum;
            if (left == 0) {
                sum = prefixSum[right];
            } else {
                sum = prefixSum[right] - prefixSum[left - 1];
            }

            System.out.println(sum);
        }

        scanner.close();
    }
}
