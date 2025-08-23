package Recursion;

import java.util.ArrayList;
import java.util.List;

public class subset {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        find(0,nums,new ArrayList<>(),res);
        return res;
    }
    public void find(int i,int[] nums,List<Integer> curr,List<List<Integer>> res){
        if(i==nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[i]);
        find(i+1,nums,curr,res);
        curr.remove(curr.size()-1);
        find(i+1,nums,curr,res);
    }
}
