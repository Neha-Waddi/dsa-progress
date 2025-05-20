package graphs;

import java.util.*;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegrees=new int[numCourses];
        for(int i=0;i<prerequisites.length;i++){
            indegrees[prerequisites[i][1]]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegrees[i]==0)
            q.offer(i);
        }
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<prerequisites.length;i++){
            int u=prerequisites[i][0];
            int v=prerequisites[i][1];
            adj.get(u).add(v);
        }
        int count=0;
        while(!q.isEmpty()){
            int curr=q.poll();
            count++;
            for(int a:adj.get(curr)){
                indegrees[a]--;
                if(indegrees[a]==0)
                q.offer(a);
            }
        }
        if(count==numCourses) return true;
        return false;

    }
}