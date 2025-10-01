import java.util.*;

public class largestarray {
    static int largest(int[]arr) {
        Arrays.sort(arr);
        return arr[arr.length-1];
}
public static void main(String[] args) {
    int[] arr = {10, 524, 444, 50, 9808};
    System.out.println(largest(arr));
}
}
