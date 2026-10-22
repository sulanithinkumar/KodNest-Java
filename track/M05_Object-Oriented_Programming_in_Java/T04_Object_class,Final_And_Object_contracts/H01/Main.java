
import java.util.Scanner;

class Product {

    int id;
    String name;

    Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "Product: " + id + " - " + name;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        String name = scanner.next();

        Product p = new Product(id, name);

        System.out.println(p.toString());

        scanner.close();
    }
}
