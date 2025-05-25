package Dynamic_programming;

public class AritmeticSlices {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3)
        return 0;

        int dp=0,total=0;
        for(int i=2;i<nums.length;i++){
            if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2]){
                dp=dp+1;
                total+=dp;
            }
            else{
                dp=0;
            }
        }
        return total;
    }
}
