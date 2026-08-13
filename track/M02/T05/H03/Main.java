
import java.util.Scanner;

class ResultCalculator {

    int getTotal(int first, int second) {
        return first + second;

    }

    int getTotal(int first, int second, int third) {
        return first + second + third;

    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int first = scanner.nextInt();
        System.out.println("Enter second number: ");
        int second = scanner.nextInt();
        System.out.println("Enter third number: ");
        int third = scanner.nextInt();

        ResultCalculator c = new ResultCalculator();

        System.out.println("Two-Mark Total: " + c.getTotal(first, second));
        System.out.println("Three-Mark Total: " + c.getTotal(first, second, third));
    }
}
