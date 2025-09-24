

import java.util.*;  // <-- Required for Map & HashMap

public class DSAProblems {

    /* ------------------ 1. TWO SUM ------------------ */
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }
            map.put(nums[i], i);  
        }
        return new int[]{-1, -1}; // no solution
    }

    /* ------------------ MAIN METHOD ------------------ */
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);

        System.out.println("Result indices: " + Arrays.toString(result));
        // Expected output: [0, 1]
    }
}

    

