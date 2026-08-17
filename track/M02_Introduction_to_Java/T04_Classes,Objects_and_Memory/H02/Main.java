
import java.util.Scanner;

class Student {

    int id;
    String name;
    double percentage;
}

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Student s1 = new Student();

        System.out.println("Enter S1 id: ");
        s1.id = scan.nextInt();

        scan.nextLine();
        System.out.println("Enter S1 name: ");
        s1.name = scan.nextLine();

        System.out.println("Enter S1 attendance percentage: ");
        s1.percentage = scan.nextDouble();

        Student s2 = new Student();

        System.out.println("Enter S2 id: ");
        s2.id = scan.nextInt();

        scan.nextLine();
        System.out.println("Enter S2 name: ");
        s2.name = scan.nextLine();

        System.out.println("Enter S2 attendance percentage: ");
        s2.percentage = scan.nextDouble();

        System.out.println("Enter selected id: ");
        int selectedId = scan.nextInt();

        System.out.println("Enter new attendance percentage: ");
        double newAttendance = scan.nextDouble();

        Student selectedStudent = null;

        if (s1.id == selectedId) {

            selectedStudent = s1;

        } else if (s2.id == selectedId) {

            selectedStudent = s2;

        }

        if (selectedStudent != null) {

            selectedStudent.percentage = newAttendance;
            System.out.println("Selected Student: " + selectedStudent.name);

        } else {
            System.out.println("Student not found.");
        }

        System.out.println(s1.id + " - " + s1.name + " - " + s1.percentage + "%");

        System.out.println(s2.id + " - " + s2.name + " - " + s2.percentage + "%");

    }

}
