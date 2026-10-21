
import java.util.Scanner;

class Student {

    static int count;

    Student(int count) {
        // Increase the shared count.
        this.count = count;

    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = scanner.nextInt();

        // Create the required objects and display Student.count.
        Student st = new Student(numberOfStudents);
        System.out.println("Created students: " + st.count);

    }
}
