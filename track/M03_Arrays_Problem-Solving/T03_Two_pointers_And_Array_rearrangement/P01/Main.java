
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int write = 0;

        for (int read = 0; read < n; read++) {
            if (arr[read] != 0) {
                arr[write] = arr[read];
                write++;
            }
        }

        while (write < n) {
            arr[write] = 0;
            write++;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + (i == n - 1 ? "" : " "));
        }

        scanner.close();
    }
}
