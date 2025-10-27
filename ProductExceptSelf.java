// File: ProductExceptSelf.java
import java.util.*;

public class ProductExceptSelf {
    
    // LeetCode signature
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        // prefix products
        int prefix = 1;
        for (int i = 0; i < n; i++) {
            ans[i] = prefix;
            prefix *= nums[i];
        }

        // multiply by suffix products
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= suffix;
            suffix *= nums[i];
        }
        return ans;
    }
     public static void main(String[] args) {
        ProductExceptSelf solver = new ProductExceptSelf();
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(solver.productExceptSelf(nums))); // [24,12,8,6]

        int[] nums2 = {0,4,0};
        System.out.println(Arrays.toString(solver.productExceptSelf(nums2))); // [0,0,0]
    }
}
