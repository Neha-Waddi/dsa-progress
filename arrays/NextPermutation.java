package arrays;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int pos=n-2;
        while(pos>=0 && nums[pos]>=nums[pos+1]){
            pos--;
        }
        if(pos>=0){
            int j=n-1;
            while(nums[j]<=nums[pos]){
                j--;
            }
            swap(nums,j,pos);
        }
        reverse(nums,pos+1,n-1);
    }
    public void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public void reverse(int[] nums,int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}
