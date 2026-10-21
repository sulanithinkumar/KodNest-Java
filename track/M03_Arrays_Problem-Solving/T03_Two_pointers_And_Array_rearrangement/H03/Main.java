
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

        // Use opposite-end pointers to partition negatives to the beginning
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            // Advance left pointer while elements are negative
            while (left <= right && arr[left] < 0) {
                left++;
            }
            // Move right pointer while elements are non-negative (>= 0)
            while (left <= right && arr[right] >= 0) {
                right--;
            }
            // Swap if pointers haven't crossed
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        // Print the rearranged array elements separated by a space
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + (i == n - 1 ? "" : " "));
        }
        System.out.println();

        scanner.close();
    }
}
