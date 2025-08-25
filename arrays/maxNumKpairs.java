import java.util.Arrays;

public class maxNumKpairs {
     public int maxOperations(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int count=0;

        int i=0;
        int j=n-1;
        while(i<j){
            if(nums[i]+nums[j]==k){
                i++;
                j--;
                count++;
            }
            else if(nums[i]+nums[j]>k){
                j--;
            }
            else{
                i++;
            }

        }
        return count;
    }
}
