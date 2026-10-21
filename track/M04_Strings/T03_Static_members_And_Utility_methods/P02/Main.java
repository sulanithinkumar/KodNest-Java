
import java.util.Scanner;

class Calculator {

    static int add(int first, int second) {
        // Return the sum.
        int sum = first + second;
        return sum;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two integers and call Calculator.add().
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int sum = Calculator.add(num1, num2);
        System.out.println("Sum: " + sum);
    }
}
