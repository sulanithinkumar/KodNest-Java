
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Array size: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter array values: ");
        for (int i = 0; i <= numbers.length - 1; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Enter target value: ");
        int target = scanner.nextInt();

        int found = -1;

        for (int i = 0; i <= numbers.length - 1; i++) {

            if (numbers[i] == target) {
                found = i;
                break;
            }
        }

        System.out.println("First index: " + found);

    }
}
