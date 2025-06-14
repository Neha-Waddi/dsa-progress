package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Nmeetings {
    class meeting{
    int start;
    int end;
    int index;
    meeting(int start,int end,int index){
        this.start=start;
        this.end=end;
        this.index=index;
    }
}
class comp implements Comparator<meeting>{
    public int compare(meeting a,meeting b){
        if(a.end<b.end) return -1;
        else if(a.end>b.end) return 1;
        else if (a.index<b.index) return -1;
        return 1;
    }
}
class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
 
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        int n=start.length;
        ArrayList<meeting> list=new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new meeting(start[i],end[i],i));
        }
        comp c=new comp();
        Collections.sort(list,c);
        int ending=list.get(0).end;
        res.add(list.get(0).index);
        
        for(int i=1;i<n;i++){
            if(list.get(i).start>ending){
                ending=list.get(i).end;
                res.add(list.get(i).index);
            }
        }
        return res.size();
        
        
        
    }
}

}
