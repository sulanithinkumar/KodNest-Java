
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

        // Use two pointers to check for a palindrome
        int left = 0;
        int right = n - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (arr[left] != arr[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Print 1 for palindrome, 0 otherwise
        if (isPalindrome) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        scanner.close();
    }
}
