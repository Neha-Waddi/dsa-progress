package BinarySearch;

import java.util.Arrays;

public class AggressiveCows {
     public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int low=1;
        int n=stalls.length;
        int high=stalls[n-1]-stalls[0];
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(stalls,k,mid)){
                low=mid+1;
            }
            else
            high=mid-1;
        }
        return high;
        
    }
    public static boolean check(int[] nums,int k,int mid){
        
        int cows=1;
        int last=nums[0];
        for(int i=1;i<nums.length;i++){
            if(Math.abs(nums[i]-last)>=mid){
                cows++;
                last=nums[i];
            }
        }
        return cows>=k;
    }
}
