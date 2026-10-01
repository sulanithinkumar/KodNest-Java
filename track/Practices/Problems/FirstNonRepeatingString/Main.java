
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter string: ");
        String str = scan.next();

        char arr[] = str.toCharArray();

        char firstChar = arr[0];

        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != firstChar && count == 0) {
                break;
            }
            count++;
            firstChar = arr[i];
        }
        System.out.println(firstChar);

    }
}
