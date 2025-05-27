package Dynamic_programming;

import java.util.Arrays;

public class UniquePaths2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][] dp=new int[m][n];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return count(obstacleGrid,dp,0,0,m,n);
    }
    public int count(int[][] grid,int[][] dp,int i,int j,int m,int n){
        if(i==m-1 && j==n-1 && grid[i][j]!=1){
            return 1;
        }
        if(i>=m || j>=n) return 0;
        if(grid[i][j]==1) return 0;
        if(dp[i][j]!=-1) return dp[i][j];

        int right=count(grid,dp,i+1,j,m,n);
        int down=count(grid,dp,i,j+1,m,n);

        dp[i][j]=right+down;
        return dp[i][j];
    }
}
