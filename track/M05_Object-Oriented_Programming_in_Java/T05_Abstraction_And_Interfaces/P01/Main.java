
abstract class Vehicle {

    abstract void move();
}

class Bike extends Vehicle {

    @Override
    void move() {
        System.out.println("Bike moves");
    }
}

public class Main {

    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.move();
    }
}
