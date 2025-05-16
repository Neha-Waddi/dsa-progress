//using bit manipulation


import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int size=nums.length;
        int n=1<<size;

        List<List<Integer>> res=new ArrayList<>();

        for(int mask=0;mask<n;mask++){
            List<Integer> subset=new ArrayList<>();
            for(int i=0;i<size;i++){
                if( (mask & (1<<i)) !=0 ){
                    subset.add(nums[i]);
                }
            }
            res.add(subset);
        }

        return res;
    }
}
