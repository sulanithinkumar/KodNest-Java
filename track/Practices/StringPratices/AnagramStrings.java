
import java.util.Arrays;
import java.util.Scanner;

public class AnagramStrings {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter String 1: ");
        String s1 = scan.next();

        System.out.println("Enter String 2: ");
        String s2 = scan.next();

        if (s1.length() != s2.length()) {
            System.out.println("The given Strings are Not a Anagrams...");
            return;
        }

        char Arr1[] = s1.toCharArray();
        char Arr2[] = s2.toCharArray();

        Arrays.sort(Arr1);
        Arrays.sort(Arr2);

        String sortedString1 = new String(Arr1);
        String sortedString2 = new String(Arr2);

        if (sortedString1.equalsIgnoreCase(sortedString2)) {
            System.out.println("The given String are Anagrams...");
        } else {
            System.out.println("The given String are Not a Anagrams...");
        }

    }
}
