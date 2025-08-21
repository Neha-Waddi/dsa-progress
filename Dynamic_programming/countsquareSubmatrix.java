package Dynamic_programming;

import java.util.Arrays;

public class countsquareSubmatrix {
    public int countSquares(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;

        int[][] dp=new int[m][n];
        for(int[] row:dp) Arrays.fill(row,-1);

        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==1)
                count+=find(i,j,matrix,dp);
            }
        }

        return count;
    }
    public int find(int i,int j,int[][] matrix,int[][] dp){
        if(i<0 || j<0 || i>=matrix.length || j>=matrix[0].length){
            return 0;
        }

        if(dp[i][j]!=-1) return dp[i][j];

        if(matrix[i][j]==0) return 0;

        int right=find(i,j+1,matrix,dp);
        int diag=find(i+1,j+1,matrix,dp);
        int down=find(i+1,j,matrix,dp);

        return dp[i][j]=1+Math.min(right,Math.min(down,diag));
    }
}
