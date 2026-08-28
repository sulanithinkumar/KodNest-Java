
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int arr[] = new int[scanner.nextInt()];

        System.out.println("Enter array values: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i == arr.length ? "" : " "));
        }
        scanner.close();

    }

}
