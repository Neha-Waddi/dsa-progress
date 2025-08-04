public class sortedSquares {
    public int[] sortedsquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        int start=0;
        int end=nums.length-1;
        int[] res=new int[nums.length];
        for(int pos=nums.length-1;pos>=0;pos--){
            if(nums[start]>nums[end]){
                res[pos]=nums[start];
                start++;
            }
            else{
                res[pos]=nums[end];
                end--;
            }
        }
        return res;
    }
}
