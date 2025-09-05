import java.util.PriorityQueue;

public class mincostRopes {
    public static int minCost(int[] arr) {
        // code here
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:arr)
        pq.offer(i);
        
        int cost=0;
        
        while(pq.size()>1){
            int a=pq.poll();
            int b=pq.poll();
            
            cost+=(a+b);
            pq.offer(a+b);
        }
        return cost;
    }
}
