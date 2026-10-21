
import java.util.Scanner;

class Student {

    String name;
    static int count;

    Student(String name) {
        // Store the name and increase the count.
        this.name = name;
        count++;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two names, create two objects and display the result.
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();

        Student s1 = new Student(name1);
        Student s2 = new Student(name2);

        System.out.println("Student: " + s1.name);
        System.out.println("Student: " + s2.name);
        System.out.println("Total students: " + Student.count);
    }
}
