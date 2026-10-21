
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Array size: ");
        int n = scan.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter Array values: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }
        System.out.println(maxCount);
        scan.close();
    }
}
