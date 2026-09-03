
public class Main3 {

    public static void main(String[] args) {
        int a[] = {12, 23, 34, 45};
        int temp = a[0];

        for (int i = 1; i < a.length; i++) {
            a[i - 1] = a[i];
        }
        a[a.length - 1] = temp;
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
