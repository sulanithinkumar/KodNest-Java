
import java.util.Scanner;

class Employee {

    int id;
    String name;
    String department;

    Employee(int id, String name, String department) {

        this.id = id;
        this.name = name;
        this.department = department;
    }

    void display() {

        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);

    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter id: ");
        int id = scan.nextInt();

        scan.nextLine();
        System.out.println("Enter Name: ");
        String name = scan.nextLine();

        System.out.println("Enter department: ");
        String department = scan.nextLine();

        Employee emp = new Employee(id, name, department);

        emp.display();

    }
}
