
import java.util.Scanner;

class NumberUtility {

    static int larger(int first, int second) {

        return Math.max(first, second);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Larger: " + NumberUtility.larger(scanner.nextInt(), scanner.nextInt()));
    }
}
