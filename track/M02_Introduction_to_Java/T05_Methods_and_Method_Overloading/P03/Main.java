
import java.util.Scanner;

class Student {

    String name;

    void setName(String name) {
        this.name = name;

    }

    void displayName() {
        System.out.println("Student Name: " + name);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String name = scanner.nextLine();

        Student s = new Student();
        s.setName(name);
        s.displayName();

    }

}
