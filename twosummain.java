import java.util.*;

public class twosummain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();          // number of elements
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        int target = sc.nextInt();     // target sum

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int need = target - nums[i];
            if (map.containsKey(need)) {
                System.out.println(map.get(need) + " " + i);
                return;
            }
            map.put(nums[i], i);
        }

        System.out.println("No solution");
    }
}
