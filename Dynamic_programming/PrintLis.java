package Dynamic_programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PrintLis {
    class Solution {
    public ArrayList<Integer> getLIS(int arr[]) {
        // Code here
        int n=arr.length;
        int[] dp=new int[n];
        int[] prev=new int[n];
        int max=1;
        int max_idx=0;
        ArrayList<Integer> res=new ArrayList<>();

        Arrays.fill(dp,1);
        Arrays.fill(prev,-1);
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j]){
                    if(dp[j]+1>dp[i]){
                        dp[i]=dp[j]+1;
                        prev[i]=j;
                    }
                }
            }
            if(dp[i]>max){
                max=dp[i];
                max_idx=i;
            }
        }
        while(max_idx!=-1){
            res.add(arr[max_idx]);
            max_idx=prev[max_idx];
        }
        Collections.reverse(res);
        return res;
    }
}
}
