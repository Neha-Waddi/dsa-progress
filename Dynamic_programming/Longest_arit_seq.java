package Dynamic_programming;

import java.util.HashMap;
import java.util.Map;

public class Longest_arit_seq {
     public int longestSubsequence(int[] arr, int difference) {
        Map<Integer,Integer> dp=new HashMap<>();
        int max=0;
        for(int i:arr){
            int len=dp.getOrDefault(i-difference,0)+1;
            dp.put(i,len);
            max=Math.max(max,len); 
        }
        return max;
    }
}
