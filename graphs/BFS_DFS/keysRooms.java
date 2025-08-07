package graphs.BFS_DFS;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class keysRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        int[] vis=new int[n];

        Queue<Integer> q=new LinkedList<>();
        q.offer(0);
        vis[0]=1;

        while(!q.isEmpty()){
            int front=q.poll();
            for(int a:rooms.get(front)){
                if(vis[a]!=1){
                q.offer(a);
                vis[a]=1;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(vis[i]==0) return false;
        }
        return true;

    }
}
