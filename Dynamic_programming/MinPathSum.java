package Dynamic_programming;

import java.util.Arrays;

public class MinPathSum {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return sum(grid,dp,0,0,m,n);
    }
    public int sum(int[][] grid,int[][] dp,int i,int j,int m,int n){
        if(i==m-1 && j==n-1){
            return grid[i][j];
        }
        if(i>=m || j>=n) return Integer.MAX_VALUE;
        if(dp[i][j]!=-1) return dp[i][j];

        int right=sum(grid,dp,i,j+1,m,n);
        int down=sum(grid,dp,i+1,j,m,n);

        dp[i][j]=grid[i][j]+Math.min(right,down);
        return dp[i][j];
    }
}
