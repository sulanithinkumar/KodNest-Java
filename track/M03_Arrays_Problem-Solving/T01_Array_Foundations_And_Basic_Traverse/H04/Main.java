
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter array-1 size: ");
        int n = scan.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array values: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println("Enter array-2 size: ");
        int m = scan.nextInt();
        int b[] = new int[m];
        System.out.println("Enter array values: ");
        for (int i = 0; i < b.length; i++) {
            b[i] = scan.nextInt();
        }
        boolean res = false;
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    res = false;
                    break;
                } else {
                    res = true;
                }
            }

        }
        System.out.println((res ? "1" : "0"));

    }
}
