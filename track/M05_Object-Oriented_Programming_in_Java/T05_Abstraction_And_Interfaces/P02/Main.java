
import java.util.Scanner;

abstract class Vehicle {

    abstract void start();
}

class Bike extends Vehicle {

    String brand;

    Bike(String brand) {
        this.brand = brand;
    }

    @Override
    void start() {
        System.out.println(brand + " bike started");
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String brand = scanner.next();

        Bike bike = new Bike(brand);
        bike.start();
    }
}
