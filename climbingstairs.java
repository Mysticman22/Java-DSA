class climbingstairs {

    climbingstairs() {
    }

    public int climbStairs(int var1) {
        if (var1 <= 2) {
            return var1;
        } else {
            int[] var2 = new int[var1 + 1];
            var2[1] = 1;
            var2[2] = 2;

            for (int var3 = 3; var3 <= var1; ++var3) {
                var2[var3] = var2[var3 - 1] + var2[var3 - 2];
            }

            return var2[var1];
        }
    }

    // main method to test
    public static void main(String[] args) {
        climbingstairs cs = new climbingstairs();

        int n = 5; // example: number of steps
        int ways = cs.climbStairs(n);

        System.out.println("Number of ways to climb " + n + " stairs: " + ways);
    }
}
