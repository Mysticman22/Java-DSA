 import java.util.*;

public class ArrayProduct {

    // Function to calculate product of array except self
    public static int[] productExceptSelf(int[] nums) {
        if (nums == null) return new int[0];

        int n = nums.length;
        int[] ans = new int[n];

        // Prefix product
        int prefix = 1;
        for (int i = 0; i < n; i++) {
            ans[i] = prefix;
            prefix *= nums[i];
        }

        // Suffix product
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= suffix;
            suffix *= nums[i]; 
        }

        return ans;
    }

    // Main method inside same class
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = productExceptSelf(nums);

        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Product Except Self: " + Arrays.toString(result));
    }
}
