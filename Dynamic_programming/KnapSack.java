package Dynamic_programming;

public class KnapSack {
    static int knapsack(int W, int val[], int wt[]) {
        int n = wt.length;
        int[][] dp = new int[n][W + 1];


        for (int w = 0; w <= W; w++) {
            if (wt[0] <= w)
                dp[0][w] = val[0];
        }


        for (int i = 1; i < n; i++) {
            for (int w = 0; w <= W; w++) {
                int not_take = dp[i - 1][w];
                int take = Integer.MIN_VALUE;
                if (wt[i] <= w) {
                    take = val[i] + dp[i - 1][w - wt[i]];
                }

                dp[i][w] = Math.max(take, not_take);
            }
        }

        return dp[n - 1][W];
    }
}
