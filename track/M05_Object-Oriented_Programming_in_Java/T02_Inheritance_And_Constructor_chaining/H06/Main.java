
import java.util.Scanner;

class Person {

    Person(String name) {

        System.out.println("Person " + name);
    }
}

class Employee extends Person {

    Employee(String name) {

        super(name);
        System.out.println("Employee");
    }
}

class Developer extends Employee {

    Developer(String name) {

        super(name);
        System.out.println("Developer");

    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Developer d = new Developer(scanner.next());
    }
}
