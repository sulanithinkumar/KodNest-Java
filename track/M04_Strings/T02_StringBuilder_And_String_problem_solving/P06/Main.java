
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine().toLowerCase();
        String second = scanner.nextLine().toLowerCase();

        System.out.println("Anagram: " + isAnagram(first, second));
    }

    public static boolean isAnagram(String first, String second) {

        if (first.length() != second.length()) {
            return false;
        }

        StringBuilder sbr1 = new StringBuilder(first);
        StringBuilder sbr2 = new StringBuilder(second);

        for (int i = 0; i < sbr1.length(); i++) {
            char letter = sbr1.charAt(i);

            int matchIndex = sbr2.indexOf(String.valueOf(letter));

            if (matchIndex == -1) {
                return false;
            } else {
                sbr2.deleteCharAt(matchIndex);
            }
        }
        return true;

    }
}
