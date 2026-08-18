
public class Main {

    public static void main(String[] args) {
        int readings[] = {12, 14, 16, 18};
        int updateIndex = 2;
        int newValue = 25;

        int snapshot[] = new int[readings.length];

        int j = 0;
        for (int i = 0; i <= readings.length - 1; i++) {
            snapshot[j] = readings[i];
            j++;

        }

        if (updateIndex >= 0 && updateIndex < readings.length) {

            readings[updateIndex] = newValue;

        }

        System.out.print("Snapshot: ");

        for (int i = 0; i < readings.length; i++) {
            System.out.print(snapshot[i] + (i == readings.length ? "" : " "));
        }
        System.out.print("\nUpdated: ");
        for (int i = 0; i < readings.length; i++) {
            System.out.print(readings[i] + (i == readings.length ? "" : " "));
        }
    }
}
