package prefixsum;

public class sumOfAbsDiff {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length;
        int left_sum=0;
        int tot=0;
        for(int i:nums) tot+=i;

        int[] res=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            int left=(nums[i]*i)-left_sum;
            int right=tot-left_sum-(nums[i]*(n-i));

            res[k++]=left+right;
            left_sum+=nums[i];
        }
        return res;
    }
}
