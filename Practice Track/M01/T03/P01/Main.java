
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.println("Enter your city: ");
        String city = scanner.nextLine();

        System.out.println("Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);

        scanner.close();

    }

}
