
import java.util.Scanner;

class Employee {

    String name;
    String role = "Trainee";

    Employee(String name) {

        this.name = name;
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Role: " + role);

    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        Employee emp = new Employee(name);

        emp.display();

    }
}
