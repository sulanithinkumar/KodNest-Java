
import java.util.Scanner;

class Learner {

    private int age;

    public void setAge(int age) {
        if (age >= 1 && age <= 100) {
            this.age = age;
        }
    }

    public void getAge() {
        System.out.println(age);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Learner learner = new Learner();

        int age = scan.nextInt();

        learner.setAge(age);
        learner.getAge();

    }
}
