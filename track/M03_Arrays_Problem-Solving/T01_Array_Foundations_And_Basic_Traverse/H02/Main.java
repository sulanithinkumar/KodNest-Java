
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int arr[] = new int[scanner.nextInt()];
        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;

        System.out.println("Enter array values: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > 0) {
                posCount++;
            } else if (arr[i] < 0) {
                negCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.print(posCount + " " + negCount + " " + zeroCount);

        scanner.close();
    }
}
