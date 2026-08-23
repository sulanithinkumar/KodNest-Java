
import java.util.Scanner;

class Employee {

    int employeeId;
    String name;
    double salary;
    double bonus;
    int sno = 1;

    Employee() {
        employeeId = 0;
        name = "";
        salary = 0.0;
        bonus = 0.0;
    }

    Employee(int employeeId, String name, double salary, double bonus) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }

    void setEmployeeDetails(int employeeId, String name, double salary) {
        sno++;
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        bonus = 0.0;
    }

    void addBonus(double bonusAmount) {
        bonus += bonusAmount;
    }

    void addBonus(double bonusPercentage, double extraReward) {
        double percentageBonus = salary * bonusPercentage / 100.0;
        double additionalBonus = percentageBonus + extraReward;
        bonus += additionalBonus;
    }

    double calculateTotalSalary() {
        double totalSalary = salary + bonus;
        return totalSalary;
    }

    void displayEmployee() {
        System.out.println("Employee " + sno);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateTotalSalary() + "\n");
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee Id: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.println("Enter salary: ");
        double salary = scanner.nextDouble();
        System.out.println("Enter bonus: ");
        double bonus = scanner.nextDouble();

        Employee emp1 = new Employee(employeeId, name, salary, bonus);

        System.out.println("Enter Employee Id: ");
        employeeId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter employee name: ");
        name = scanner.nextLine();
        System.out.println("Enter salary: ");
        salary = scanner.nextDouble();
        System.out.println("Enter bonus: ");
        bonus = scanner.nextDouble();

        Employee emp2 = new Employee();
        emp2.setEmployeeDetails(employeeId, name, salary);

        emp2.addBonus(bonus);

        System.out.println("Enter bonus percentage: ");
        double bonusPercentage = scanner.nextDouble();
        System.out.println("Enter extra reward: ");
        double extraReward = scanner.nextDouble();

        emp2.addBonus(bonusPercentage, extraReward);
        emp1.displayEmployee();
        emp2.displayEmployee();

    }
}
