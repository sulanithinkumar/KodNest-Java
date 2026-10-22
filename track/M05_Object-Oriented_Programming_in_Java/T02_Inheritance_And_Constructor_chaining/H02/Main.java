
import java.util.Scanner;

class Person {

    private String name;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
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
        System.out.println(emp.getName());

    }
}
