
import java.util.Scanner;

class Student {

    private byte age;

    public void setAge(byte age) {
        this.age = age;
    }

    public byte displayAge() {
        return age;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        byte age = scanner.nextByte();

        Student student = new Student();
        student.setAge(age);
        System.out.println(student.displayAge());
    }
}
