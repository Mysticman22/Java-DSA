import java.util.*;

public class MinimumBoxesForApples {

    public static int minimumBoxes(int[] apple, int[] capacity) {
        int totalApples = 0;

        // Calculate total apples
        for (int a : apple) {
            totalApples += a;
        }

        // Sort box capacities in descending order
        Arrays.sort(capacity);

        int boxesUsed = 0;

        for (int i = capacity.length - 1; i >= 0 && totalApples > 0; i--) {
            totalApples -= capacity[i];
            boxesUsed++;
        }

        return boxesUsed;
    }

    // ✅ MAIN METHOD
    public static void main(String[] args) {
        int[] apple = {1, 3, 2};
        int[] capacity = {4, 3, 1, 5};

        int result = minimumBoxes(apple, capacity);
        System.out.println("Minimum boxes needed: " + result);
    }
}
