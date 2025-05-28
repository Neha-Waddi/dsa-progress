package Dynamic_programming;

import java.util.Arrays;
import java.util.List;

public class Triangle_minTotal {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m=triangle.size();
        int n=triangle.get(m-1).size();
        int[][] dp=new int[m][n];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return sum(triangle,dp,0,0,m,n);
    }
    public int sum(List<List<Integer>> triangle,int[][] dp,int i,int j,int m,int n){
        if(i==m-1) return triangle.get(i).get(j);
        if(i>=m || j>=i+1) return Integer.MAX_VALUE;
        if(dp[i][j]!=-1) return dp[i][j];

        int down=sum(triangle,dp,i+1,j,m,n);
        int diag=sum(triangle,dp,i+1,j+1,m,n);

        dp[i][j]=triangle.get(i).get(j)+Math.min(down,diag);
        return dp[i][j];
    }
}
