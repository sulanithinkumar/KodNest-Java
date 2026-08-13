
import java.util.Scanner;

class Student {

    String name;

    void setName(String name) {
        this.name = name;
    }

    void showName() {
        System.out.println("Student Name: " + this.name);
    }

    void showScore(int first) {
        System.out.println("First Score: " + first);
    }

    void showScore(int first, int second) {
        System.out.println("Two-Score Total: " + (first + second));

    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Full Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter first score: ");
        int first = scanner.nextInt();
        System.out.println("Enter second score: ");
        int second = scanner.nextInt();

        Student s = new Student();

        s.setName(name);
        s.showName();
        s.showScore(first);
        s.showScore(first, second);

    }
}
