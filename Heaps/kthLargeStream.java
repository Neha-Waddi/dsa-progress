import java.util.List;
import java.util.PriorityQueue;

public class kthLargeStream {
    int k;
    List<Integer> scores;
    PriorityQueue<Integer> pq;

    public  kthLargeStream(int k, int[] nums) {
        this.k=k;
        pq=new PriorityQueue<>();
        for(int num:nums){
            pq.offer(num);
            if(pq.size()>k) pq.poll();
        }
    }
    
    public int add(int val) {
        pq.offer(val);
        if(pq.size()>k) pq.poll();

        return pq.peek();
    }
}
