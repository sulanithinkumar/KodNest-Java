
public class Main {

    public static void main(String[] args) {
        int[] original = {14, 18, 22, 26};
        int updateIndex = 1;
        int updateValue = 25;
        int requestedIndex = 4;

        int[] snapshot = new int[original.length];

        int j = 0;
        for (int i = 0; i <= original.length - 1; i++) {
            snapshot[j] = original[i];
            j++;

        }

        int[] liveView = original;

        if (updateIndex >= 0 && updateIndex < liveView.length) {

            original[updateIndex] = updateValue;

        }

        boolean comparision = false;

        if (liveView == original) {

            comparision = true;

        }

        String res = requestedIndex >= 0 && requestedIndex <= original.length ? "valid index" : "Invalid index";

        System.out.print("Original: ");
        for (int i = 0; i <= original.length - 1; i++) {
            System.out.print(original[i] + (i == original.length ? "" : " "));
        }
        System.out.print("\nSnapshot: ");
        for (int i = 0; i <= snapshot.length - 1; i++) {
            System.out.print(snapshot[i] + (i == original.length ? "" : " "));
        }

        System.out.println("\nSame object: " + comparision);
        System.out.println("Requested value: " + res);

    }
}
