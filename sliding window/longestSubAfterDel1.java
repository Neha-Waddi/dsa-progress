public class longestSubAfterDel1 {
    public int longestSubarray(int[] nums) {
        int extra=0;
        int left=0;
        int max=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
                extra++;
            }
            while(extra>1){
                if(nums[left]==0){
                    extra--;
                }
                left++;
            }
            max=Math.max(max,right-left);
        }
        return max;
    }
}
