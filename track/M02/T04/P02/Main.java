
import java.util.Scanner;

class Student {

    int id;
    String name;
    int javaScore;

}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student s1 = new Student();
        System.out.println("Enter S1 id: ");
        s1.id = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Enter S1 name: ");
        s1.name = scanner.nextLine();

        System.out.println("Enter S1 Java Score: ");
        s1.javaScore = scanner.nextInt();

        Student s2 = new Student();

        System.out.println("Enter S2 id: ");
        s2.id = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Enter S2 name: ");
        s2.name = scanner.nextLine();

        System.out.println("Enter S2 Java Score: ");
        s2.javaScore = scanner.nextInt();

        System.out.println(s1.id + " - " + s1.name + " - " + s1.javaScore);
        System.out.println(s2.id + " - " + s2.name + " - " + s2.javaScore);

        if (s1.javaScore > s2.javaScore) {

            System.out.println(s1.name + " has the higher Java score.");

        } else if (s2.javaScore > s1.javaScore) {

            System.out.println(s2.name + " has the higher Java score.");

        } else {

            System.out.println("Both students have the same Java score.");

        }

    }

}
