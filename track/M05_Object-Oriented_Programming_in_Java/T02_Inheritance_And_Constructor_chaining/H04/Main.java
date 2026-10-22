
import java.util.Scanner;

class Vehicle {

    private String brand;

    Vehicle(String brand) {

        this.brand = brand;
    }

    public String getBrand() {

        return brand;
    }
}

class Car extends Vehicle {

    Car(String brand) {

        super(brand);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car c = new Car(scanner.next());

        System.out.println(c.getBrand());
    }
}
