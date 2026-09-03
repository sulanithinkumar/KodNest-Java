
public class Main2 {

    public static void main(String[] args) {
        int a[] = {10, 20, 40, 50};
        int element = 30;
        int index = 2;

        int b[] = new int[a.length + 1];

        for (int i = 0; i < index; i++) {
            b[i] = a[i];
        }
        b[index] = element;
        for (int i = index; i < a.length; i++) {
            b[i + 1] = a[i];
        }
        for (int num : b) {
            System.out.print(num + " ");
        }
    }
}
