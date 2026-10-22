
import java.util.Scanner;

class Printer {

    public void print(int value) {

        System.out.println("Number " + value);
    }

    public void print(String value) {
        System.out.println("Text " + value);
    }
}

class ColorPrinter extends Printer {

    public void print(String value) {
        System.out.println("Color" + value);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        String word = scanner.nextLine();

        Printer p = new ColorPrinter();
        p.print(num);
        p.print(word);

    }
}
