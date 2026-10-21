
import java.util.Scanner;

class Learner {

    String learnerName;
    static String instituteName;

    Learner(String learnerName) {

        this.learnerName = learnerName;
        display();
    }

    void display() {

        System.out.println(learnerName + " - " + instituteName);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Learner.instituteName = scanner.nextLine();

        String learner1 = scanner.nextLine();
        String learner2 = scanner.nextLine();

        Learner l1 = new Learner(learner1);
        Learner l2 = new Learner(learner2);

    }
}
