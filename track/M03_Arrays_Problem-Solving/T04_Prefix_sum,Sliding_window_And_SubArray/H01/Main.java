
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
        scanner.close();

        long S_n = (long) n * (n + 1) / 2;
        long S_sq_n = (long) n * (n + 1) * (2L * n + 1) / 6;

        long S_arr = 0;
        long S_sq_arr = 0;

        for (int i = 0; i < n; i++) {
            S_arr += arr[i];
            S_sq_arr += (long) arr[i] * arr[i];
        }

        // Let X be the repeating value and Y be the missing value.
        // X - Y = S_arr - S_n
        long diff = S_arr - S_n;

        // X^2 - Y^2 = S_sq_arr - S_sq_n
        // (X - Y)(X + Y) = S_sq_arr - S_sq_n
        long diffSq = S_sq_arr - S_sq_n;

        long sum = diffSq / diff;

        // X = (diff + sum) / 2
        long repeating = (diff + sum) / 2;
        // Y = sum - X
        long missing = sum - repeating;

        System.out.println(repeating + " " + missing);
    }
}
