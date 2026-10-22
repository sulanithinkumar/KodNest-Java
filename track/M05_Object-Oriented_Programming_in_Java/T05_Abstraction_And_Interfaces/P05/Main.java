
import java.util.Scanner;

interface Switchable {

    void switchOn();
}

interface Chargeable {

    void charge();
}

class Phone implements Switchable, Chargeable {

    String name;

    Phone(String name) {
        this.name = name;
    }

    public void switchOn() {
        System.out.println(name + " switched on");
    }

    public void charge() {
        System.out.println(name + " charging");
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        Phone ph = new Phone(name);

        ph.switchOn();
        ph.charge();
    }
}
