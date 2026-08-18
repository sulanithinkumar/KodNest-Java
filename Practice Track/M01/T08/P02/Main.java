
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
        System.out.println("Enter new value: ");
        int newValue = scanner.nextInt();

        int count = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == target) {

                numbers[i] = newValue;
                count += 1;
            }

        }

        System.out.println("Changes: " + count);

        System.out.print("Updated array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + (i == numbers.length ? "" : " "));
        }
    }
}
