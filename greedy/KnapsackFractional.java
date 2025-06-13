package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class KnapsackFractional {
    static class itemcomp implements Comparator<int[]> {
        public int compare(int[] a, int[] b) {
            double a1 = ((double)a[0]) / a[1];
            double b1 = ((double)b[0]) / b[1];
            return Double.compare(b1, a1);
        }
    }
    double fractionalKnapsack(int[] values, int[] weights, int W) {
        // code here
        int n=weights.length;
        int[][] items=new int[n][2];
        for(int i=0;i<n;i++){
            items[i][0]=values[i];
            items[i][1]=weights[i];
        }
        double max=0;
        Arrays.sort(items,new itemcomp());
        for(int i=0;i<n;i++){
            if(items[i][1]<=W){
                max+=items[i][0];
                W=W-items[i][1];
            }
            else{
                max+=((double)items[i][0]/items[i][1])*W;
                break;
            }
        }
        return max;
        
    }
}
