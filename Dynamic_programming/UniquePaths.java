package Dynamic_programming;

import java.util.Arrays;

public class UniquePaths {
        int[][] dp=new int[3][3];

    public int uniquePaths(int m, int n) {
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return count(dp,0,0,m,n);
    }
    public int count(int[][] dp,int i,int j,int m,int n){
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(i>=m || j>=n) return 0;
        if(dp[i][j]!=-1) return dp[i][j];

        int right=count(dp,i+1,j,m,n);
        int down=count(dp,i,j+1,m,n);
        dp[i][j]=right+down;
        return dp[i][j];
    }
    public static void main(String[] args) {
        UniquePaths obj=new UniquePaths();
        System.out.println(obj.uniquePaths(3, 3));
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(obj.dp[i][j]+" ");
            }
        }
    }
}
