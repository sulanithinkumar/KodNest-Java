
import java.util.Scanner;

class StudentProgress {

    String name;
    int completedLessons;
    int totalLessons;
    int percentage;
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StudentProgress o1 = new StudentProgress();
        System.out.println("Enter Name: ");
        o1.name = scanner.nextLine();

        System.out.println("Enter completed lessons: ");
        o1.completedLessons = scanner.nextInt();

        System.out.println("Enter total lessons: ");
        o1.totalLessons = scanner.nextInt();

        o1.percentage = o1.completedLessons * 100 / o1.totalLessons;

        System.out.println("Student: " + o1.name);
        System.out.println("Progress: " + o1.completedLessons + "/" + o1.totalLessons);
        System.out.println("Completion: " + o1.percentage + "%");

    }
}
