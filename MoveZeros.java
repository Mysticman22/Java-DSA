import java.util.Arrays;
public class MoveZeros {
    public static void main(String[] args) {
        int[] a = {0, 1, 0, 7, 12}; int j = 0;
        for (int i : a) if (i != 0) a[j++] = i;
        while (j < a.length) a[j++] = 0;
        System.out.println(Arrays.toString(a));
    }
}
// Output: [1, 7, 12, 0, 0]
// The code moves all zeros in the array to the end while maintaining the order of non-zero