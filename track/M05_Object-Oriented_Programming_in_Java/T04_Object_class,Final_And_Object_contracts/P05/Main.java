
import java.util.Scanner;

final class StudentRecord {

    final int id;
    final String name;

    StudentRecord(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void getter() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        String name = scanner.next();

        StudentRecord sr = new StudentRecord(id, name);

        sr.getter();
        scanner.close();
    }
}
