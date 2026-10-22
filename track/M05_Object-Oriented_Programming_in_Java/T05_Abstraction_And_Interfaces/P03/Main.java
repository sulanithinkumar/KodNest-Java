
import java.util.Scanner;

abstract class Employee {

    private String name;

    Employee(String name) {
        this.name = name;
    }

    void showName() {
        System.out.println("Name: " + name);
    }

    abstract void showRole();
}

class Developer extends Employee {

    Developer(String name) {
        super(name);
    }

    @Override
    void showRole() {
        System.out.println("Role: " + getClass().getSimpleName());
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        Developer dev = new Developer(name);

        dev.showName();
        dev.showRole();
    }
}
