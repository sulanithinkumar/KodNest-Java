
import java.util.Scanner;

class Vehicle {

    public void move(int speed) {
        System.out.println("Vehicle " + speed);
    }
}

class Car extends Vehicle {

    public void move(int speed) {
        System.out.println("Car " + speed);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vehicle v = new Car();

        v.move(scanner.nextInt());
    }
}
