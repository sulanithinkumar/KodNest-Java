
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
        int first = -1;
        int last = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                if (first == -1) {
                    first = i;
                    last = i;
                } else {
                    last = i;
                }
            }
        }
        System.out.print(first + " " + last);
    }
}
