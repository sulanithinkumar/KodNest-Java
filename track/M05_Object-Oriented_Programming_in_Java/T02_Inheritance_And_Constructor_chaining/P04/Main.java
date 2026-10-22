
import java.util.Scanner;

class Person {

    private String name;

    Person(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }
}

class Student extends Person {

    private int marks;

    Student(String name, int marks) {

        super(name);

        this.marks = marks;
    }

    public void display() {

        System.out.println(getName() + " " + marks);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        int marks = scanner.nextInt();

        Student std = new Student(name, marks);

        std.display();
    }
}
