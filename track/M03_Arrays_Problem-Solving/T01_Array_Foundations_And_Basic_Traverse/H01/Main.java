
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
        System.out.println("Enter target value: ");
        int target = scanner.nextInt();
        int found = -1;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                found = i;
                break;

            }

        }
        System.out.println(found);

        scanner.close();
    }
}
