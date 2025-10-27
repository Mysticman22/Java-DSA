public class MaxMinArray {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 9, 1};
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int n : arr) { max = Math.max(max, n); min = Math.min(min, n); }
        System.out.println("Max=" + max + " Min=" + min);
    }
}
