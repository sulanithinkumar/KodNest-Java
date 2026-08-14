
import java.util.Scanner;

class Student {

    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Student Name: " + name);

    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter full name: ");
        String name = scanner.nextLine();
        Student s = new Student(name);
        s.display();

    }
}
