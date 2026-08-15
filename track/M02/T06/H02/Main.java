
import java.util.Scanner;

class MobilePlan {

    String planName;
    int price;

    MobilePlan() {
        planName = "Basic";
        price = 199;
    }

    MobilePlan(String planName, int price) {
        this.planName = planName;
        this.price = price;
    }

    void display() {
        System.out.println("Plan: " + planName + ", Price: " + price);

    }

}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter plan name: ");
        String planName = scanner.nextLine();
        System.out.println("Enter price: ");
        int price = scanner.nextInt();

        MobilePlan p1 = new MobilePlan();

        MobilePlan p2 = new MobilePlan(planName, price);

        p1.display();
        p2.display();

    }

}
