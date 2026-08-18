
public class Main {

    public static void main(String[] args) {
        int values[] = {10, 20, 30, 40, 50};
        int bonus = 5;
        for (int i = 0; i <= values.length - 1; i++) {
            values[i] += 5;
        }
        System.out.print("Updated values: ");
        for (int i = 0; i <= values.length - 1; i++) {
            System.out.print(values[i] + (i == values.length ? "" : " "));

        }
    }
}
