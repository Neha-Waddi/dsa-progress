package Dynamic_programming;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class frogJumpHardLC {
    public boolean canCross(int[] stones) {
        int n=stones.length;

        Set<Integer> set=new HashSet<>();
        for(int i:stones) set.add(i);

        Map<String,Boolean> dp=new HashMap<>();
        return find(0,0,stones[n-1],set,dp);
    }
    public boolean find(int k,int last,int end,Set<Integer> set,Map<String,Boolean> dp){
        if(k==end) return true;
        if(k>end) return false;

        if(dp.containsKey(k+" "+last)) return dp.get(k+" "+last);
        boolean one=false;
        boolean two=false;
        boolean three=false;


        int next=last-1;
        if(next>0 && set.contains(k+next))  one=find(k+next,next,end,set,dp);

        next=last;
        if(next>0 && set.contains(k+next))  two=find(k+next,next,end,set,dp);

        next=last+1;
        if(next>0 && set.contains(k+next)) three=find(k+next,next,end,set,dp);
        
        boolean res=one||two||three;
        dp.put(k+" "+last,res);
        return res;

    }
}
