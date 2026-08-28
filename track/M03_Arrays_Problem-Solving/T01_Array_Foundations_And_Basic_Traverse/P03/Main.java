
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int n = scanner.nextInt();
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter array values: ");
        for (int i = 1; i <= n; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.print(evenCount + " " + oddCount);

        scanner.close();

    }

}
