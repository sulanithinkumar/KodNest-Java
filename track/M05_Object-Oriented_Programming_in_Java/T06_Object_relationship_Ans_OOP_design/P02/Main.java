
import java.util.Scanner;

class Mentor {

    private String name;

    Mentor(String name) {
        this.name = name;
    }

    void guide(String studentName) {
        System.out.println(name + " guides " + studentName);
    }
}

class Student {

    private String name;

    Student(String name) {
        this.name = name;
    }

    void learnFrom(Mentor mentor) {
        mentor.guide(name);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Student name: ");
        String studentName = scanner.nextLine();
        System.out.println("Enter Mentor name: ");
        String mentorName = scanner.nextLine();

        Student student = new Student(studentName);
        Mentor mentor = new Mentor(mentorName);

        student.learnFrom(mentor);
    }
}
