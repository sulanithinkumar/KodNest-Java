
import java.util.Scanner;

class Course {

    private final String courseCode;

    Course(String code) {
        courseCode = code;
    }

    String display() {
        return courseCode;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.next();

        Course c = new Course(code);
        System.out.println(c.getClass().getSimpleName() + ": " + c.display());

        scanner.close();
    }
}
