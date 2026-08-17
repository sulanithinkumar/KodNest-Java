
import java.util.Scanner;

public class Prgm4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int a[] = new int[scan.nextInt()];

        System.out.println("Enter the array values: ");

        for (int i = 0; i <= a.length - 1; i++) {

            a[i] = scan.nextInt();
        }

        System.out.println("Array values are: ");

        for (int i = a.length - 1; i >= 0; i--) {

            System.out.println(a[i]);
        }

    }

}
