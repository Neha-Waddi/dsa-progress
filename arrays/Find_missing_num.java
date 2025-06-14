

public class Find_missing_num {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int correct=(n*(n+1))/2;
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        return correct-sum;
    }
}
