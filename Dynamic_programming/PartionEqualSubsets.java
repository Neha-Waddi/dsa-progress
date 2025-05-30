package Dynamic_programming;

public class PartionEqualSubsets {
    class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += num;

        // If total sum is odd, can't partition into equal halves
        if (sum % 2 != 0) return false;

        int target = sum / 2;
        int n = nums.length;
        
        boolean[][] dp = new boolean[n][target + 1];

        // Base case: With target 0, we can always form a subset (empty subset)
        for (int i = 0; i < n; i++) {
            dp[i][0] = true;
        }

        // Base case: With only the first element
        if (nums[0] <= target) {
            dp[0][nums[0]] = true;
        }

        // Fill the dp table
        for (int i = 1; i < n; i++) {
            for (int t = 1; t <= target; t++) {
                boolean notTake = dp[i - 1][t];
                boolean take = false;
                if (nums[i] <= t) {
                    take = dp[i - 1][t - nums[i]];
                }
                dp[i][t] = take || notTake;
            }
        }

        return dp[n - 1][target];
    }
}

}
