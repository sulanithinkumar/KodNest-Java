
import java.util.Scanner;

class FoodOrder {

    String item;
    int quantity;

    FoodOrder(String item) {
        this.item = item;
        this.quantity = 1;
    }

    FoodOrder(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Order: " + item + ", Quantity: " + quantity);

    }

}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter item name: ");
        String item = scanner.nextLine();
        System.out.println("Enter Quantity:");
        int quantity = scanner.nextInt();

        FoodOrder o1 = new FoodOrder(item);

        FoodOrder o2 = new FoodOrder(item, quantity);

        o1.display();
        o2.display();

    }
}
