
import java.util.Scanner;

class WaterTank {

    int capacity;
    int currentLevel;

    WaterTank(int capacity, int currentLevel) {
        this.capacity = capacity;
        this.currentLevel = currentLevel;
    }

    int fillWater(int amount) {
        if (amount <= 0) {
            return 0;
        }
        int availableSpace = capacity - currentLevel;
        int actualAdded = amount <= availableSpace ? amount : availableSpace;

        currentLevel += actualAdded;
        return actualAdded;
    }

    int drainWater(int amount) {
        if (amount <= 0) {
            return 0;
        }
        int actualRemove = amount <= currentLevel ? amount : currentLevel;
        currentLevel -= actualRemove;
        return actualRemove;
    }

    String getStatus() {

        if (currentLevel == 0) {
            return "Empty";
        } else if (currentLevel == capacity) {
            return "Full";
        }

        double fillPercentage = currentLevel * 100.0 / capacity;

        if (fillPercentage > 0 && fillPercentage <= 25) {
            return "Low";
        } else if (fillPercentage > 25 && fillPercentage <= 75) {
            return "Medium";
        } else {
            return "High";
        }
    }

    void displayTank() {

        int availableSpace = capacity - currentLevel;
        System.out.println("Capacity: " + capacity);
        System.out.println("Current Level: " + currentLevel);
        System.out.println("Available Space: " + availableSpace);
        System.out.println("Status: " + getStatus());
    }

}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter tank capacity: ");
        int capacity = scanner.nextInt();
        System.out.println("Enter current level: ");
        int currentLevel = scanner.nextInt();
        System.out.println("Enter no of operations: ");
        int operations = scanner.nextInt();

        WaterTank wt = new WaterTank(capacity, currentLevel);

        for (int i = 0; i < operations; i++) {

            System.out.println("1.Fill Tank");
            System.out.println("2.Drain Tank");
            System.out.println("3.Display Tank\n");

            System.out.println("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter amount to fill: ");
                    int amount = scanner.nextInt();
                    int filled = wt.fillWater(amount);
                    System.out.println("Operation " + (i + 1) + " - Filled: " + filled);
                    break;

                case 2:
                    System.out.println("Enter amount to drain: ");
                    amount = scanner.nextInt();
                    int drained = wt.drainWater(amount);
                    System.out.println("Operation " + (i + 1) + " - Drained: " + drained);
                    break;

                case 3:
                    System.out.println("Operation " + (i + 1) + " - Tank Status");
                    wt.displayTank();
            }
        }

        System.out.println("Final Tank Status");
        wt.displayTank();
    }

}
