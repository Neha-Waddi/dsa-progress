package arrays;

public class Max_Sum_subarray {
        public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int curr=0;
        for(int i:nums){
            curr=Math.max(i,i+curr);
            max=Math.max(max,curr);
        }
        return max;
    }
}
