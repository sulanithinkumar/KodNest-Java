
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

        // Print the prefix sum array elements separated by a space
        for (int i = 0; i < n; i++) {
            System.out.print(prefixSum[i] + (i == n - 1 ? "" : " "));
        }
        System.out.println();

        scanner.close();
    }
}
