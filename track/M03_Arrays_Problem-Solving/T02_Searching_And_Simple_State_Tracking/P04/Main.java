
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
        int largest = a[0];
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                second = largest;
                largest = a[i];
            } else if (a[i] > second && a[i] != largest) {
                second = a[i];
            }
        }
        System.out.print(second == Integer.MIN_VALUE ? "No second largest distinct value" : second);
    }
}
