package Dynamic_programming;

import java.util.Arrays;

public class maximalSquare {
    int max=0;
    public int maximalsquare(char[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;

        int[][] dp=new int[m][n];
        for(int[] row:dp) Arrays.fill(row,-1);
        find(0,0,matrix,dp);
        return max*max;

    }
    public int find(int i,int j,char[][] mat,int[][] dp){
        int m=mat.length;
        int n=mat[0].length;

        if(i<0 || i>=m ||j<0 ||j>=n) return 0;
        if(dp[i][j]!=-1) return dp[i][j];

       

        int right=find(i,j+1,mat,dp);
        int down=find(i+1,j,mat,dp);
        int diag=find(i+1,j+1,mat,dp);
        if(mat[i][j]=='0') return dp[i][j]=0;

        int ans=1+Math.min(right,Math.min(diag,down));
        max=Math.max(max,ans);
        return dp[i][j]=ans;

    }
}
