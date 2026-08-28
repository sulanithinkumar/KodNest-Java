
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int arr[] = new int[scan.nextInt()];

        System.out.println("Enter array values: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        int count = 0;
        System.out.println("Enter lower boundary: ");
        int lower = scan.nextInt();

        System.out.println("Enter upper boundary: ");
        int upper = scan.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= lower && arr[i] <= upper) {
                count++;
            }
        }
        System.out.print(count);

    }
}
