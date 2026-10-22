
import java.util.Scanner;

class Student {

    private short marks;

    public boolean setMarks(short marks) {

        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
            return true;
        } else {
            return false;
        }
    }

    public short getMarks() {

        return marks;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short marks = scanner.nextShort();

        Student std = new Student();

        boolean result = std.setMarks(marks);

        if (result) {
            System.out.println(std.getMarks());
        } else {
            System.out.println("Invalid marks");
        }
    }
}
