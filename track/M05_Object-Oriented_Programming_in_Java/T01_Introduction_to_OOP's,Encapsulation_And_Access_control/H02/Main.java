
import java.util.Scanner;

class Course {

    private double fee;

    Course(double fee) {

        if (fee > 0) {
            this.fee = fee;
        }
    }

    public double getFee() {
        return fee;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double fee = scanner.nextDouble();

        Course course = new Course(fee);

        System.out.println(course.getFee());

    }
}
