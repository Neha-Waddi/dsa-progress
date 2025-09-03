import java.util.Arrays;

public class suseqSatisyTarget {
    class Solution {
        int mod=1000000007;

    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int count=0;

        int left=0;
        int right=nums.length-1;


        while(left<=right){
            if(nums[left]+nums[right]<=target){
                count=(count+(power(right-left)))%mod;
                left++;
            }
            else
            right--;
        }
        return count%mod;
    }
    public int power(int exp){
        long result = 1;
    long b = 2;
    while (exp > 0) {
        if ((exp & 1) == 1) {
            result = (result * b) % mod;
        }
        b = (b * b) % mod;
        exp >>= 1;
    }
    return (int) result;
    }
}
}
