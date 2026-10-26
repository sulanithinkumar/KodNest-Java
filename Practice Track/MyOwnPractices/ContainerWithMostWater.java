
import java.util.*;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter no of walls: ");
        int n = scanner.nextInt();

        System.out.println("Enter heights of each walls: ");
        int[] height = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = scanner.nextInt();
        }
        System.out.println(maxArea(height));
        scanner.close();
    }

    public static long maxArea(int[] height) {
        long maxArea = 0;
        int i = 0;
        int j = height.length - 1;

        while (i < j) {
            maxArea = Math.max(maxArea, (long) (Math.min(height[i], height[j]) * (j - i)));

            if (height[i] <= height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }
}
