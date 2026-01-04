import java.util.Arrays;

public class MoveZerosToFirst {
    public static void main(String[] args) {
        int[] a = {0, 1, 0, 3, 12};

        int n = a.length;
        int[] result = new int[n];

        int index = 0;

        // Step 1: Place zeroes first
        for (int x : a) {
            if (x == 0)  {
                result[index++] = 0;
            }
        }

        // Step 2: Place non-zero elements
        for (int x : a) {
            if (x != 0) {
                result[index++] = x;
            }
        }

        System.out.println(Arrays.toString(result));
    }
}
