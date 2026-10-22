
import java.util.Scanner;

class Person {

    private String name;

    public void setName(String name) {

        this.name = name;
    }

    public void displayWelcome() {

        System.out.println("Welcome " + name);
    }
}

class Employee extends Person {

}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();

        Employee emp = new Employee();

        emp.setName(name);
        emp.displayWelcome();
    }
}
