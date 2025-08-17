package graphs.topological_sort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CoureSchedule2 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        List<List<Integer>> adj=new ArrayList<>();

        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:prerequisites){
            int a=edge[0];
            int b=edge[1];
            adj.get(b).add(a);
        }

        int[] indegree=new int[numCourses];
        for(int i=0;i<prerequisites.length;i++){
            indegree[prerequisites[i][0]]++;
        }

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0)
            q.offer(i);
        }
        
        int[] res=new int[numCourses];
        int idx=0;
        while(!q.isEmpty()){
            int front=q.poll();
            res[idx++]=front;
            for(int a:adj.get(front)){
                indegree[a]--;
                if(indegree[a]==0)
                q.offer(a);
            }
        }
        if(idx!=numCourses) return new int[0];
        return res;
    }
}
