
import java.util.Scanner;

class SalesAnalyzer {

    double dailySales[];

    SalesAnalyzer(double dailySales[]) {

        this.dailySales = dailySales;

    }

    double calculateTotal() {
        double total = 0;
        for (int i = 0; i < dailySales.length; i++) {
            total += dailySales[i];
        }
        return total;
    }

    double calculateAverage() {
        double average = calculateTotal() / dailySales.length;
        return average;
    }

    int findHighestSalesDay() {
        int highestDay = 0;
        double highest = dailySales[0];
        for (int i = 1; i < dailySales.length; i++) {
            if (dailySales[i] > highest) {
                highestDay = i;
                highest = dailySales[i];
            }
        }
        return highestDay + 1;
    }

    int findLowestSalesDay() {
        int lowestDay = 0;
        double lowest = dailySales[0];
        for (int i = 1; i < dailySales.length; i++) {
            if (dailySales[i] < lowest) {
                lowestDay = i;
                lowest = dailySales[i];
            }
        }
        return lowestDay + 1;
    }

    int countAboveAverageDays() {
        int count = 0;
        double average = calculateAverage();
        for (int i = 0; i < dailySales.length; i++) {
            if (dailySales[i] > average) {
                count++;
            }
        }
        return count;
    }

    void displayReport() {
        int highestDay = findHighestSalesDay();
        int lowestDay = findLowestSalesDay();
        System.out.println("Number of Days: " + dailySales.length);
        System.out.println("Total Sales: " + calculateTotal());
        System.out.println("Average Sales: " + calculateAverage());
        System.out.println("Highest Sales Day: " + highestDay);
        System.out.println("Highest Sales: " + dailySales[highestDay - 1]);
        System.out.println("Lowest Sales Day: " + lowestDay);
        System.out.println("Lowest Sales: " + dailySales[lowestDay - 1]);
        System.out.println("Days Above Average: " + countAboveAverageDays());
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of days: ");
        int days = scanner.nextInt();

        double dailySales[] = new double[days];
        for (int i = 0; i < dailySales.length; i++) {
            System.out.println("Enter sales on Day-" + (i + 1) + ":");
            dailySales[i] = scanner.nextDouble();
        }

        SalesAnalyzer analyzer = new SalesAnalyzer(dailySales);

        analyzer.displayReport();
    }
}
