
import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter string: ");

        String str = scan.next();

        char arr[] = str.toCharArray();

        char revArr[] = new char[arr.length];

        int j = revArr.length - 1;

        for (int i = 0; i < arr.length; i++) {

            revArr[j] = arr[i];
            j--;
        }

        String reverse = new String(revArr);

        System.out.println(str);
        System.out.println(reverse);

    }
}
