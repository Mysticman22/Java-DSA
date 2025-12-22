import java.util.Arrays;
public class MoveZeros {
    public static void main(String[] args) {
        int[] a = {0, 1, 0, 7, 12}; int j = 0;
        for (int i : a) if (i != 0) a[j++] = i;
        while (j < a.length) a[j++] = 0;
        System.out.println(Arrays.toString(a));
    }
}
