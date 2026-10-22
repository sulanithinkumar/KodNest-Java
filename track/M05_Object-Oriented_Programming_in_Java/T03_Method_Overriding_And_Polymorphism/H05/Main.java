
import java.util.Scanner;

class Display {

    public void show(int num) {
        System.out.println("Number " + num);
    }

    public void show(String text) {
        System.out.println("Text " + text);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Display d = new Display();

        d.show(scanner.nextInt());
        d.show(scanner.next());
    }
}
