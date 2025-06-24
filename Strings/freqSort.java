import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class freqSort {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        String res="";
        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        pq.addAll(map.keySet());
        while(!pq.isEmpty()){
            char c=pq.poll();
            int count=map.get(c);
            for(int i=1;i<=count;i++) res+=c;
        }
        return res;
    }
}
