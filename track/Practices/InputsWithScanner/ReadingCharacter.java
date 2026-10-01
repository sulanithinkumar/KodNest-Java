
import java.util.Scanner;

public class ReadingCharacter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter character");
        char ch = scan.next().charAt(4);
        System.out.println(ch);

    }

}
