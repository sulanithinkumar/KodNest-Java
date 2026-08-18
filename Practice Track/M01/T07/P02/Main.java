
import java.util.Scanner;

class ScoreEditor {

    void correctScore(int[] scores, int index, int newScore) {
        if (index >= 0 && index < scores.length) {

            for (int i = 0; i < scores.length; i++) {
                if (index == i) {
                    scores[i] = newScore;
                }
            }

        } else {

            System.out.println("Invalid index");

        }

    }

    void displayScores(int[] scores) {

        System.out.print("Scores: ");

        for (int i = 0; i < scores.length; i++) {

            System.out.print(scores[i] + (i == scores.length ? "" : " "));

        }
    }

}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Array size: ");
        int size = scanner.nextInt();
        int[] scores = new int[size];

        System.out.println("Enter array values: ");

        for (int index = 0; index < scores.length; index++) {
            scores[index] = scanner.nextInt();

        }

        System.out.println("Enter correction index: ");
        int correctionIndex = scanner.nextInt();
        System.out.println("Enter new value: ");
        int newScore = scanner.nextInt();

        ScoreEditor se = new ScoreEditor();
        se.correctScore(scores, correctionIndex, newScore);
        se.displayScores(scores);

    }

}
