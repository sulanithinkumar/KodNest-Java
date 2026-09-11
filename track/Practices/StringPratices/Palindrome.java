
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter The String: ");
        String str = scan.next();

        char arr[] = str.toCharArray();
        char revArr[] = new char[arr.length];

        int j = revArr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            revArr[j] = arr[i];
            j--;
        }

        String rev = new String(revArr);

        if (str.equalsIgnoreCase(rev)) {
            System.out.println("The given string is Palindrome...");
        } else {
            System.out.println("The given String is NOT a Palindrome...");
        }
    }
}
