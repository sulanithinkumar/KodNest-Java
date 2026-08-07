
import java.util.Scanner;

public class UserInputs {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your Age");
        int age = scan.nextInt();
        System.out.println("Your age is: " + age);

        System.out.println("Enter your Height: ");
        float height = scan.nextFloat();
        System.out.println("Your heaight is: " + height);

        scan.nextLine();
        System.out.println("Enter your full name: ");
        String fname = scan.nextLine();
        System.out.println("Full Name is: " + fname);

    }
}
