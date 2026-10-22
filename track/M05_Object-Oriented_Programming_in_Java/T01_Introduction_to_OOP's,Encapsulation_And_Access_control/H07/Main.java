
import java.util.Scanner;

class Course {

    private String courseCode;

    Course(String courseCode) {

        this.courseCode = courseCode;
    }

    public String getCourseCode() {
        return courseCode;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String courseCode = scanner.next();

        Course course1 = new Course(courseCode);

        System.out.println(course1.getCourseCode());
    }
}
