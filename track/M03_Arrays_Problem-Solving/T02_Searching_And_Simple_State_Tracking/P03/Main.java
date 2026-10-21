
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array size: ");
        int a[] = new int[sc.nextInt()];

        System.out.println("Enter Array values: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int res = 1;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                res = 0;
                break;
            }
        }
        System.out.print(res);
    }
}
