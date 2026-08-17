
import java.util.Scanner;

public class Prgm5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int a[] = new int[scan.nextInt()];

        System.out.println("Enter the array values: ");

        for (int i = 0; i <= a.length - 1; i++) {

            a[i] = scan.nextInt();

        }

        int b[] = new int[a.length];
        int j = 0;

        for (int i = 0; i <= a.length - 1; i++) {
            b[j] = a[i];
        }
        j++;

        System.out.println("Array A values are: ");

        for (int i = 0; i <= a.length - 1; i++) {
            System.out.println(a[i]);
        }

        System.out.println("\nArray B values are: ");

        for (j = 0; j <= a.length - 1; j++) {
            System.out.println(a[j]);
        }

    }

}
