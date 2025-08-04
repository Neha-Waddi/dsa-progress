import java.util.*;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int need=target-nums[i];
            if(map.containsKey(need))
            {
                res[0]=map.get(need);
                res[1]=i;
                break;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return res;
    }
}

//using hashset O[n]

class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        Set<Integer> set=new HashSet<>();
        for(int num:arr){
            if(set.contains(target-num) )
            return true;
            
            set.add(num);
        }
        
        return false;
    }
}
