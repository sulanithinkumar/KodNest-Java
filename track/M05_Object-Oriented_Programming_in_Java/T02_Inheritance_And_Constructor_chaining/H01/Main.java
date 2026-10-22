
import java.util.Scanner;

class Animal {

    public void displayType(String type) {

        System.out.println(type);
    }
}

class Dog extends Animal {

}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.next();

        Dog d = new Dog();

        d.displayType(type);
    }
}
