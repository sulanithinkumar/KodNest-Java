
import java.util.Scanner;

class Parent {

    Parent(String value) {
        System.out.println("Parent " + value);
    }
}

class Child extends Parent {

    Child(String value) {

        super(value);
        System.out.println("Child");
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Child c = new Child(scanner.next());
    }
}
