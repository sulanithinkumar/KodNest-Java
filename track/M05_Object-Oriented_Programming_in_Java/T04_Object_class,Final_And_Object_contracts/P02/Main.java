
import java.util.Scanner;

class Student {

    int id;

    Student(int id) {
        this.id = id;
    }

    // Override equals()
    public boolean equals(Object obj) {
        Student std = (Student) obj;

        return std.id == this.id;

    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstId = scanner.nextInt();
        int secondId = scanner.nextInt();

        // Create two students and compare them
        Student std1 = new Student(firstId);
        Student std2 = new Student(secondId);

        if (std1.equals(std2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        scanner.close();
    }
}
