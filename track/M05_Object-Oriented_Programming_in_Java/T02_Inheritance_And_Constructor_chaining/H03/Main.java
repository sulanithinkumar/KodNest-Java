
import java.util.Scanner;

class Product {

    private String name;
    private int price;

    Product(String name) {

        this(name, 100);
    }

    Product(String name, int price) {

        this.name = name;
        this.price = price;
    }

    public void display() {

        System.out.println(name + " " + price);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();

        Product p = new Product(name);

        p.display();
    }
}
