package Dynamic_programming;
import java.util.*;

public class trainings {
    public int maximumPoints(int arr[][]) {
        // code here
        int n=arr.length;
        int[][] dp=new int[n][4];
        for(int[] row:dp) Arrays.fill(row,-1);
        int ans=max(n-1,3,arr,dp);
        return ans;
    }
    public int max(int day,int last,int arr[][],int[][] dp){
        if(day==0){
            int max=0;
            for(int i=0;i<3;i++){
                if(i!=last){
                    max=Math.max(max,arr[0][i]);
                }
            }
            return max;
        }
        if(dp[day][last]!=-1) return dp[day][last];
        int max=0;
        int points=0;
        for(int i=0;i<3;i++){
            if(i!=last){
                points=arr[day][i]+max(day-1,i,arr,dp);
                max=Math.max(max,points);
            }
        }
        return dp[day][last]=max;
    }
}
