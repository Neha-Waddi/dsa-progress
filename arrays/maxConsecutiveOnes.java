package arrays;

public class maxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int left=0;
        int max=0;
        for(int right=0;right<n;right++){
            if(nums[right]==1){
                int len=right-left+1;
                max=Math.max(max,len);
            }
            else{
                left=right+1;
            }
        }
        return max;
    }
}
