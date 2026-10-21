
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            scanner.close();
            return;
        }

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int left = scanner.nextInt();
        int right = scanner.nextInt();

        // Validate the range
        if (left < 0 || right >= n || left > right) {
            System.out.println("-1");
        } else {
            // Reverse the specified range in-place
            int l = left;
            int r = right;
            while (l < r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }

            // Print the modified array
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + (i == n - 1 ? "" : " "));
            }
            System.out.println();
        }

        scanner.close();
    }
}
