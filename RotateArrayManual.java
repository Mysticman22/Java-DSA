public class RotateArrayManual {
    static void reverse(int[] arr, int s, int e) {
        while (s < e) {
            int t = arr[s]; arr[s] = arr[e]; arr[e] = t;
            s++; e--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3; k %= arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        for (int x : arr) System.out.print(x + " ");
    }
}