package graphs;
import java.util.*;
public class ShortestPathBFS {
     public int[] shortestPath(ArrayList<ArrayList<Integer>> adj, int src) {
        // code here
        int n=adj.size();
        int[] res=new int[n];
        
       Queue<Integer> q=new LinkedList<>();
       q.offer(src);
       
       Arrays.fill(res,Integer.MAX_VALUE);
       res[src]=0;
       
       while(!q.isEmpty()){
          int front=q.poll();
          for(int a:adj.get(front)){
              if(res[front]+1<res[a]){
                  res[a]=res[front]+1;
                  q.offer(a);
                }
          }
       }
       for(int i=0;i<n;i++){
           if(res[i]==Integer.MAX_VALUE)
           res[i]=-1;
       }
       return res;
    }
}
