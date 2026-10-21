
import java.util.Scanner;

class Course {

    static {

        System.out.println("Course class initialized");
    }

    Course(String name) {

        System.out.println("Created: " + name);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Course c = new Course(scanner.nextLine());
    }
}
