import java.util.*;

public class MergeIntervals {
    // LeetCode signature
    public static int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return new int[0][];
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<>();
        int[] current = intervals[0].clone();
        for (int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];
            if (next[0] <= current[1]) { // overlap
                current[1] = Math.max(current[1], next[1]);
            } else {
                merged.add(current);
                current = next.clone();
            }
        }
        merged.add(current);
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3}, {2,6}, {8,10}, {15,18}};
        int[][] result = merge(intervals);
        System.out.println("Merged Intervals:");
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}