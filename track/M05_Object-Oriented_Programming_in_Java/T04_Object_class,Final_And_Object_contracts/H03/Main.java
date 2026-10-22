
import java.util.Scanner;

class Employee {

    int id;

    Employee(int id) {
        this.id = id;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();

        // Create first, alias and second references
        Employee emp1 = new Employee(id);
        Employee emp2 = new Employee(id);
        System.out.println(emp1.id == emp2.id);
        System.out.println(emp1 == emp2);

        scanner.close();
    }
}
