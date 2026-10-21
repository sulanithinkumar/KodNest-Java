
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a[] = new int[scan.nextInt()];
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        int j = a.length - 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 && a[j] % 2 != 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
            j--;
        }
        for (int num : a) {
            System.out.print(num + " ");
        }

    }
}
