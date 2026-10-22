
import java.util.Scanner;

final class Enrollment {

    private final int id;
    private final String course;

    Enrollment(int id, String course) {
        this.id = id;
        this.course = course;
    }

    int getId() {
        return id;
    }

    String getCourse() {
        return course;
    }

}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        String course = scanner.next();

        Enrollment en = new Enrollment(id, course);
        System.out.println("Enrollment: " + en.getId());
        System.out.println("Course: " + en.getCourse());

        scanner.close();
    }
}
