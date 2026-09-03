
import java.util.Scanner;

public class prgm1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Array Size: ");
        int a[] = new int[scan.nextInt()];

        long prefix[] = new long[a.length];
        long suffix[] = new long[a.length];

        System.out.println("Enter Array values: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        prefix[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            prefix[i] = prefix[i - 1] + a[i];
        }

        suffix[suffix.length - 1] = a[a.length - 1];
        for (int i = a.length - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + a[i];

        }

        for (long sum : prefix) {
            System.out.print(sum + " ");

        }
        System.out.println();
        for (long suffixSum : suffix) {
            System.out.print(suffixSum + " ");

        }

    }
}
