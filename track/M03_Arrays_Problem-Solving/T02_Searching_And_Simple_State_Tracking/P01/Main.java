
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Array size: ");
        int a[] = new int[scan.nextInt()];
        int sum = 0;

        System.out.println("Enter Array values: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
            sum += a[i];
        }

        double average = (double) sum / a.length;
        int count = 0;

        for (int num : a) {
            if (num > average) {
                count++;
            }
        }
        System.out.println(count);

    }
}
