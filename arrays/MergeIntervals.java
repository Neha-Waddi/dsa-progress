import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));

        List<int[]> res=new ArrayList<>();

        for(int[] pair:intervals){
            if(res.isEmpty() || res.get(res.size()-1)[1]<pair[0])
            res.add(pair);
            else
            res.get(res.size()-1)[1]=Math.max(res.get(res.size()-1)[1],pair[1]);
        }
        return res.toArray(new int[res.size()][]); 
    }
}
