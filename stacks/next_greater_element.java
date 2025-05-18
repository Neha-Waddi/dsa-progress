import java.util.*;
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        int n=nums.length;
        int[] res=new int[n];
        Arrays.fill(res,-1);

        for(int i=2*n-1;i>=0;i--){
            int index=i%n;
            while(!stack.isEmpty() &&stack.peek()<=nums[index] ){
                stack.pop();
            }
            if(!stack.isEmpty()){
                res[index]=stack.peek();
            }
            stack.push(nums[index]);
        }
        return res;
        
    }
}