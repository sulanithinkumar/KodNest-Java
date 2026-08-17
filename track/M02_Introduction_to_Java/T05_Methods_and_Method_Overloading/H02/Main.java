
import java.util.Scanner;

class Employee {

    String name;
    double salary;

    void setDetails(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);

    }

}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter full name: ");
        String fullName = scanner.nextLine();

        System.out.println("Enter salary: ");
        double salary = scanner.nextDouble();

        Employee emp = new Employee();

        emp.setDetails(fullName, salary);
        emp.displayDetails();
    }
}
