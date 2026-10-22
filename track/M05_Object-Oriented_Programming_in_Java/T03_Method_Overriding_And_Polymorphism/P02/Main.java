
import java.util.Scanner;

class Employee {

    public void displayRole(String role) {
        System.out.println("Employee " + role);
    }
}

class Developer extends Employee {

    @Override
    public void displayRole(String role) {
        System.out.println("Developer " + role);
    }

}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String role = scanner.next();

        Developer dev = new Developer();

        dev.displayRole(role);
    }
}
