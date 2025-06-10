package Dynamic_programming;

import java.util.Arrays;

public class LongestBitcoinseq {
    public static int LongestBitonicSequence(int n, int[] nums) {
        // code here
        int[] dpf=new int[n];
        int[] dpb=new int[n];
        
        Arrays.fill(dpf,1);
        Arrays.fill(dpb,1);
        
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dpf[i]=Math.max(dpf[i],dpf[j]+1);
                }
            }
        }
        for(int i=n-1;i>=0;i--){
            for(int j=n-1;j>i;j--){
                if(nums[i]>nums[j]){
                    dpb[i]=Math.max(dpb[i],dpb[j]+1);
                }
            }
        }
        int max=0;
        for(int i=0;i<n;i++){
            if(dpf[i]>1 && dpb[i]>1)
            max=Math.max(max,dpf[i]+dpb[i]-1);
        }
        return max;
    }
}
