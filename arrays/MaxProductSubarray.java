public class MaxProductSubarray {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int maxsofar=nums[0];
        int max=nums[0];
        int min=nums[0];

        for(int i=1;i<n;i++){
            int curr=nums[i];
            if(curr<0){
                int temp=max;
                max=min;
                min=temp;
            }
            max=Math.max(curr,max*curr);
            min=Math.min(curr,curr*min);

            maxsofar=Math.max(maxsofar,max);
        }
        return maxsofar;
    }
}
