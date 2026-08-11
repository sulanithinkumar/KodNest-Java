
import java.util.Scanner;

class MethodDemo {

    void sayHello() {
        System.out.println("Hello from a method!");
    }

    void greet(String name) {
        System.out.println("Hello, " + name + "!");

    }

    int getLuckyNumber() {
        int num = 7;
        return num;
    }

    int add(int first, int second) {
        int sum = first + second;
        return sum;

    }

}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter first number: ");
        int first = scanner.nextInt();

        System.out.println("Enter second number: ");
        int second = scanner.nextInt();

        MethodDemo m = new MethodDemo();
        m.sayHello();
        m.greet(name);
        int num = m.getLuckyNumber();
        int sum = m.add(first, second);
        System.out.println("Lucky Number: " + num);
        System.out.println("Sum: " + sum);

    }
}
