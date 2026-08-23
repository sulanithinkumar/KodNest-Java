
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter No of Prouducts: ");
        int products = scan.nextInt();
        System.out.println("Enter no of Months: ");
        int months = scan.nextInt();

        int salesReport[][] = new int[products][months];

        System.out.println("Enter sales Values: ");
        for (int i = 0; i < products; i++) {
            for (int j = 0; j < months; j++) {
                salesReport[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < products; i++) {
            int total = 0;
            for (int j = 0; j < months; j++) {
                total += salesReport[i][j];
            }
            System.out.println("Product " + (i + 1) + " total: " + total);
        }
    }
}
