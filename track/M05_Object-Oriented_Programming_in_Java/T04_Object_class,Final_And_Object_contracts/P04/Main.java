
import java.util.Scanner;

class Training {

    final void showInstitute() {
        System.out.println("KodNest");
    }
}

final class JavaTraining extends Training {

    final String courseCode;

    JavaTraining(String courseCode) {
        this.courseCode = courseCode;
    }

    final void showCourse() {
        System.out.println("Course: " + courseCode);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.next();

        JavaTraining trainer = new JavaTraining(code);

        trainer.showInstitute();
        trainer.showCourse();

        scanner.close();
    }
}
