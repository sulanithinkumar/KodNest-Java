
import java.util.Scanner;

class Student {

    int id;
    String name;
    String course;
    double javaScore;

}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student s1 = new Student();
        System.out.println("Enter id: ");
        s1.id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Name: ");
        s1.name = scanner.nextLine();

        System.out.println("Enter Course: ");
        s1.course = scanner.nextLine();

        System.out.println("Enter Java Score: ");
        s1.javaScore = scanner.nextDouble();

        System.out.println("Student Profile");
        System.out.println("ID: " + s1.id);
        System.out.println("Name: " + s1.name);
        System.out.println("Course: " + s1.course);
        System.out.println("Java Score: " + s1.javaScore);

    }

}
