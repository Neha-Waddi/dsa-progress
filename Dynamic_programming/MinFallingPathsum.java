package Dynamic_programming;

import java.util.Arrays;

public class MinFallingPathsum {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row,Integer.MIN_VALUE);
        }
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            min = Math.min(min, sum(matrix, dp, 0, j, m, n));
        }
        return min;
    }

    public int sum(int[][] matrix, int[][] dp, int i, int j, int m, int n) {
        if (i >= m || j >= n || i < 0 || j < 0) return Integer.MAX_VALUE;
        if (i == m - 1) return matrix[i][j];
        if (dp[i][j] != Integer.MIN_VALUE) return dp[i][j];

        int ldiag = sum(matrix, dp, i + 1, j - 1, m, n);
        int below = sum(matrix, dp, i + 1, j, m, n);
        int rdiag = sum(matrix, dp, i + 1, j + 1, m, n);

        dp[i][j] = matrix[i][j] + Math.min(ldiag, Math.min(below, rdiag));
        return dp[i][j];
    }
}
