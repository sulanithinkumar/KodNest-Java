
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your monthly income: ");
        double monthlyIncome = scanner.nextDouble();

        System.out.println("Enter your room rent: ");
        double rent = scanner.nextDouble();

        System.out.println("Enter food expense: ");
        double foodExpense = scanner.nextDouble();

        System.out.println("Enter travel expense: ");
        double travelExpense = scanner.nextDouble();

        double totalExpense = rent + foodExpense + travelExpense;
        double remaining = monthlyIncome - totalExpense;

        String status = remaining >= 0 ? "Within budget" : "Over budget";

        System.out.println("Total expense: " + totalExpense);
        System.out.println("Remaining: " + remaining);
        System.out.println("Status: " + status);

        scanner.close();

    }
}
