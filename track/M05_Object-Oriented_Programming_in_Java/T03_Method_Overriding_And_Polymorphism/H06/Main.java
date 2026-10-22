
import java.util.Scanner;

class Animal {

}

class Dog extends Animal {

    public void fetch(String item) {
        System.out.println("Fetch " + item);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item = scanner.next();

        Animal animal = new Dog();

        if (animal instanceof Dog) {
            ((Dog) animal).fetch(item);
        }
    }
}
