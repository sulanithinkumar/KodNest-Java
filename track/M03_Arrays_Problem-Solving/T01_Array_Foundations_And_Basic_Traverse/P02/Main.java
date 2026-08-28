
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int arr[] = new int[scanner.nextInt()];

        System.out.println("Enter array values: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        double average = (double) total / arr.length;

        System.out.println(total);
        System.out.printf("%.2f", average);

        scanner.close();

    }
}
