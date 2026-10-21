
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Array size: ");
        int a[] = new int[scan.nextInt()];

        System.out.println("Enter Array values: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        System.out.println("Enter target value: ");
        int target = scan.nextInt();

        long minDiff = Math.abs((long) a[0] - target);
        int closest = a[0];

        for (int i = 1; i < a.length; i++) {
            long diff = Math.abs((long) a[i] - target);

            if (diff < minDiff || diff == minDiff && a[i] < closest) {

                minDiff = diff;
                closest = a[i];

            }
        }
        System.out.println(closest);

    }
}
