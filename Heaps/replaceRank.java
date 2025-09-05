import java.util.PriorityQueue;

public class replaceRank {
    static int[] replaceWithRank(int arr[], int n) {
        // code here
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]);
        
        int count=1;
        int last=-1;
        for(int i=0;i<n;i++){
            pq.offer(new int[]{arr[i],i});
        }
        
        while(!pq.isEmpty()){
            int[] front=pq.poll();
            
            if(front[0]!=last){
                arr[front[1]]=count;
                count++;
            }
            else{
                arr[front[1]] = count - 1;
            }
            last=front[0];
            
        }
        return arr;
    }
}
