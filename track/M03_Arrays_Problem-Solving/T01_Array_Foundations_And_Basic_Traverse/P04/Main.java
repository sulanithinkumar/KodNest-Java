
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

        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = (arr[i] < min ? arr[i] : min);
            max = (arr[i] > max ? arr[i] : max);
        }
        System.out.print(min + " " + max);

        scanner.close();

    }

}
