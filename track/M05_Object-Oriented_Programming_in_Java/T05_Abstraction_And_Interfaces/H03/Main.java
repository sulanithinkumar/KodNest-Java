
import java.util.Scanner;

abstract class Course {

    private String name;

    Course(String name) {
        this.name = name;
    }

    void showCourse() {
        System.out.println("Course: " + name);
    }
}

class JavaCourse extends Course {

    JavaCourse(String name) {
        super(name);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        Course course = new JavaCourse(name);

        course.showCourse();
    }
}
