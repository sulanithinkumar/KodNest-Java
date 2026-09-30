
public class Main {

    public static void main(String[] args) {

        int a[] = {10, 20, 30, 40, 50, 60};
        int target = 10;

        int result = binarySearch(a, target);

        if (result != -1) {
            System.out.println("Target found");
        } else {
            System.out.println("Target not found");
        }
    }

    public static int binarySearch(int a[], int target) {
        int left = 0;
        int right = a.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (a[mid] == target) {

                return mid;

            } else if (target > a[mid]) {

                left = mid + 1;

            } else {

                right = mid - 1;

            }
        }
        return -1;
    }
}
