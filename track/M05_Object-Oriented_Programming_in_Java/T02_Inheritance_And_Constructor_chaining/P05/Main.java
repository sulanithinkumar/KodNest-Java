
import java.util.Scanner;

class Person {

    Person(String name) {

        System.out.println("Person: " + name);
    }
}

class Student extends Person {

    Student(String name) {

        super(name);

        System.out.println("Student created");
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        Student s = new Student(name);
    }
}
