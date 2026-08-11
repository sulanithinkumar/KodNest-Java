
import java.util.Scanner;

class Learner {

    int id;
    String name;
    int javaScore;

}

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Learner s1 = new Learner();

        System.out.println("Enter S1 id: ");
        s1.id = scan.nextInt();

        scan.nextLine();
        System.out.println("Enter S1 name: ");
        s1.name = scan.nextLine();

        System.out.println("Enter S2 Java Score: ");
        s1.javaScore = scan.nextInt();

        Learner s2 = new Learner();

        System.out.println("Enter S2 id: ");
        s2.id = scan.nextInt();

        scan.nextLine();
        System.out.println("Enter S2 name: ");
        s2.name = scan.nextLine();

        System.out.println("Enter S2 Java Score: ");
        s2.javaScore = scan.nextInt();

        System.out.println("Before Update");
        System.out.println(s1.id + " - " + s1.name + " - " + s1.javaScore);
        System.out.println(s2.id + " - " + s2.name + " - " + s2.javaScore);

        System.out.println("Enter new S1's Java Score: ");
        s1.javaScore = scan.nextInt();

        System.out.println("After Update");
        System.out.println(s1.id + " - " + s1.name + "- " + s1.javaScore);
        System.out.println(s2.id + " - " + s2.name + " - " + s2.javaScore);
    }
}
