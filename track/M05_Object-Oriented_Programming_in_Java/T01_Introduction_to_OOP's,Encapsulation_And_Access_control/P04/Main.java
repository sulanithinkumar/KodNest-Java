
import java.util.Scanner;

class Employee {

    private int age;

    public boolean setAge(int age) {

        if (age >= 18 && age <= 60) {
            this.age = age;
            return true;
        } else {
            return false;
        }
    }

    public int getAge() {

        return age;

    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        Employee emp = new Employee();

        boolean result = emp.setAge(age);

        if (result) {
            System.out.println(emp.getAge());
        } else {
            System.out.println("Invalid age");
        }

    }
}
