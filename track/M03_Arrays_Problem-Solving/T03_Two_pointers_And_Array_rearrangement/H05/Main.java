
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Read the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Read the target value
        int target = scanner.nextInt();

        // Use two pointers from opposite ends
        int left = 0;
        int right = n - 1;
        boolean found = false;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println(arr[left] + " " + arr[right]);
                found = true;
                break;
            } else if (sum < target) {
                left++; // Increase sum by moving left pointer forward
            } else {
                right--; // Decrease sum by moving right pointer backward
            }
        }

        // If no valid pair was found, print -1
        if (!found) {
            System.out.println(-1);
        }

        scanner.close();
    }
}
