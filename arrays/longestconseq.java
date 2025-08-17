import java.util.HashSet;
import java.util.Set;

public class longestconseq {
    public int longestConsecutive(int[] arr) {
        // code here
        int n=arr.length;
        Set<Integer> set=new HashSet<Integer>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        
        int max=0;
        
        
        for(int i=0;i<n;i++){
            int num=arr[i];
            if(set.contains(num-1)) continue;
            
            int count=0;
            while(set.contains(num)) {
                count++;
                num++;
            }
            max=Math.max(max,count);
            
        }
        return max;
    }
}
