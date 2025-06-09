package Dynamic_programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestDivisibleSubset {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        int[] prev=new int[n];
        int max=1;
        int max_idx=0;
        ArrayList<Integer> res=new ArrayList<>();

        Arrays.sort(nums);
        Arrays.fill(dp,1);
        Arrays.fill(prev,-1);
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0){
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
            res.add(nums[max_idx]);
            max_idx=prev[max_idx];
        }
        Collections.reverse(res);
        return res;
    }
}
