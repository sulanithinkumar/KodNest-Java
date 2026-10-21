
import java.util.Scanner;

public class Main {

    static void reverse(int a[], int i, int j) {
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a[] = new int[scan.nextInt()];

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        int k = scan.nextInt();

        if (k > a.length) {
            k = k % a.length;
        }
        reverse(a, 0, k - 1);
        reverse(a, k, a.length - 1);
        reverse(a, 0, a.length - 1);
        for (int num : a) {
            System.out.print(num + " ");
        }

    }
}
