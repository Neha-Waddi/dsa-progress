import java.util.HashMap;
import java.util.PriorityQueue;

public class handsOfStraights {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i:hand){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }

        for(int k:mp.keySet()){
            pq.offer(k);
        }

        while(!pq.isEmpty()){
            int front=pq.peek();
            for(int i=0;i<groupSize;i++){
                int need=front+i;
                if(!mp.containsKey(need)) return false;
                mp.put(need,mp.getOrDefault(need,0)-1);
                if(mp.get(need)==0){
                    mp.remove(need);
                    pq.remove(need);
                }
            }
        }
        return true;
    }
}
