
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter start value: ");
        int startValue = scan.nextInt();

        System.out.println("Enter end value: ");
        int endValue = scan.nextInt();

        int evenSum = 0;
        int oddCount = 0;

        int i = startValue;

        while (i <= endValue) {

            if (i % 2 == 0) {

                evenSum += i;

            } else {

                oddCount += 1;

            }
            i++;

        }

        System.out.println("Even sum: " + evenSum);
        System.out.println("Odd count: " + oddCount);

    }
}
