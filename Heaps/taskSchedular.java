import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class taskSchedular {
    public int leastInterval(char[] tasks, int n) {
        int[] freq=new int[26];
        for(char c:tasks) freq[c-'A']++;

        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int f:freq){
            if(f>0) pq.offer(f);
        }

        int interval=0;

        while(!pq.isEmpty()){
            int cycle=n+1;
            List<Integer> temp=new ArrayList<>();

            while(cycle>0 && !pq.isEmpty()){
                int front=pq.poll();
                if(front>1) temp.add(front-1);
                interval++;
                cycle--;
            }
            for(int t:temp) pq.offer(t);
            if(!pq.isEmpty()) interval+=cycle;     
        }
        return interval;

    }
}
