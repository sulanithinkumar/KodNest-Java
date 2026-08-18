
public class Main {

    public static void main(String[] args) {
        int stock[] = {4, 12, 2, 9, 5};
        int reoderLevel = 5;

        int reorderCount = 0;

        for (int i = 0; i <= stock.length - 1; i++) {
            if (stock[i] <= reoderLevel) {
                reorderCount += 1;
            }
        }

        System.out.println("Items to reorder: " + reorderCount);

    }

}
