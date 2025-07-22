//count substr with len k and k-1 distinct characters

package potd;

import java.util.HashMap;
import java.util.Map;

public class substr_sw {
    public int substrCount(String s, int k) {
        // code here
        Map<Character,Integer> map=new HashMap<>();
        int left=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            if(i-left+1>k){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                if(map.get(s.charAt(left))==0){
                map.remove(s.charAt(left));
             
                }
                   left++;
                
            }
            if(i-left+1==k){
                if(map.size()==k-1)
                count++;
            }
            
        }
        return count;
    }
}
