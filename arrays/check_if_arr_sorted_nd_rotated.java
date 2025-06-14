

public class check_if_arr_sorted_nd_rotated {
    public boolean check(int[] nums) {
        int n=nums.length;
        int once=0;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n] ){
            once++;
            if(once>1) return false;
            }
            
        }
        return true;
    }
}
