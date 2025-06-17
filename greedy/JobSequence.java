package greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class JobSequence {
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        // code here
        int n=deadline.length;
        int[][] data=new int[n][2];
        int max_deadline=0;
        for(int i=0;i<n;i++){
            data[i][0]=deadline[i];
            data[i][1]=profit[i];
            max_deadline=Math.max(max_deadline,deadline[i]);
        }
        
        Arrays.sort(data,(a,b)->(b[1]-a[1]));
        
        int[] res=new int[max_deadline+1];
        Arrays.fill(res,-1);
        int job=0;
        int prof=0;
        
        for(int i=0;i<n;i++){
            for(int j=data[i][0];j>0;j--){
                if(res[j]==-1){
                    res[j]=data[i][1];
                    job++;
                    prof+=data[i][1];
                    break;
                }
            }
        }
        ArrayList<Integer> ans=new ArrayList<>(Arrays.asList(job,prof));
        return ans;
        
        
    }
}
