import java.util.*;

class maxhappiness {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness); // sort ascending
        long sum = 0;
        int n = happiness.length;

        // Pick k children from the highest happiness values
        for (int i = 0; i < k; i++) {
            int value = happiness[n - 1 - i] - i;
            if (value > 0) {
                sum += value;
            }
          }
        return sum;
    }
}
