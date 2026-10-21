
import java.util.Scanner;

class Demo {

    static {

        System.out.println("Static block executed");
    }

    Demo() {

        System.out.println("Constructor executed");
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {

            Demo demo = new Demo();
        }
    }
}
