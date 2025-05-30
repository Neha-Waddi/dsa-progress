package Dynamic_programming;

public class Partition_min_absdiff {
    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for (int i : stones) sum+=i;

        int n = stones.length;
        boolean[][] dp = new boolean[n][sum + 1];

        for (int i = 0; i < n; i++) dp[i][0] = true;
        if (stones[0] <= sum) dp[0][stones[0]] = true;

        for (int i = 1; i < n; i++) {
            for (int t = 1; t <= sum; t++) {
                boolean not = dp[i - 1][t];
                boolean take = (stones[i] <= t) ? dp[i - 1][t - stones[i]] : false;
                dp[i][t] = take || not;
            }
        }
        int min=Integer.MAX_VALUE;
        for (int s1 =0; s1 <= sum/2; s1++) {
            if (dp[n - 1][s1]) {
                int s2=sum-s1;
                min=Math.min(min,Math.abs(s1-s2));
            }
        }

        return min; 
    }
}
