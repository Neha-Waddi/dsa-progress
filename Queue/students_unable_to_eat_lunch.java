package Queue;

import java.util.*;
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q=new LinkedList<>();
        int s=0;
        int count=0;

        for(int i:students)
        q.offer(i);
        
        while(!q.isEmpty()){
            if(q.peek()==sandwiches[s]){
                q.poll();
                s++;
                count=0;
            }
            else{
                q.offer(q.poll());
                count++;
            }
            if(q.size()==count) break;
        }
        return q.size();
    }
}