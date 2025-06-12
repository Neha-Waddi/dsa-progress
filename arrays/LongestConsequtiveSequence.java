import java.util.*;
public class LongestConsequtiveSequence {
     public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        return 0;
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int max=0;
        for(int i:set){
            if(!set.contains(i-1)){
                int count=1;
                while(set.contains(i+1)){
                    count++;
                    i=i+1;
                }
                max=Math.max(max,count);
            }
        }
        return max;
    }
}
