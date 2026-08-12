
import java.util.Scanner;

class Printer {

    void show(int number) {
        System.out.println("Number: " + number);
    }

    void show(String word) {
        System.out.println("Word: " + word);

    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Word: ");
        String word = scanner.next();

        Printer p = new Printer();

        p.show(num);
        p.show(word);
    }
}
