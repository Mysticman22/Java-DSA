import java.util.*;

public class KthLargest_Heap {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int x : nums) {
            minHeap.offer(x);
            if (minHeap.size() > k) minHeap.poll();
        }
        return minHeap.peek();
    }
      
    public static void main(String[] args) {
        KthLargest_Heap solver = new KthLargest_Heap();
        System.out.println(solver.findKthLargest(new int[]{3,2,1,5,6,4}, 2)); // 5
        System.out.println(solver.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4)); // 4
    }
}
