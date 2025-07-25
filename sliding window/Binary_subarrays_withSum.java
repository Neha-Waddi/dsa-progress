public class Binary_subarrays_withSum {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return check(nums,goal)-check(nums,goal-1);
    }
    public int check(int[] nums,int goal){
        int count=0;
        int sum=0;
        int left=0;
        if(goal<0) return 0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>goal){
                sum-=nums[left];
                left++;
            }
            count+=(right-left+1);
        }
        return count;
    }
}
