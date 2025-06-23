package Dynamic_programming;

public class FrogJumpK {
    public int frogJump(int[] heights, int k) {
        int n = heights.length;
        int[] dp = new int[n];
        dp[0] = 0;

        for (int i = 1; i < n; i++) {
            int minCost = Integer.MAX_VALUE;
            for (int j = 1; j <= k; j++) {
                if (i - j >= 0) {
                    int jumpCost = dp[i - j] + Math.abs(heights[i] - heights[i - j]);
                    minCost = Math.min(minCost, jumpCost);
                }
            }
            dp[i] = minCost;
        }

        return dp[n - 1];
    }
}
