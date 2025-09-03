import java.util.Comparator;
import java.util.PriorityQueue;

public class maxAvgPassratio {
     public double maxAverageRatio(int[][] classes, int k) {
        PriorityQueue<double[]> pq=new PriorityQueue<>(new Comparator<>(){
            public int compare(double[] a,double[] b){
                return Double.compare(b[2],a[2]);
            }
        });

        for(int[] arr:classes){
            pq.offer(new double[]{arr[0],arr[1],gain(arr[0],arr[1])});
        }

        while(k-->0){
            double[] front=pq.poll();
            front[0]++;
            front[1]++;
            pq.offer(new double[]{front[0],front[1],gain(front[0],front[1])});
        }
        double sum=0;
        for(double[] arr:pq){
            sum+=arr[0]/arr[1];
        }
        return sum/classes.length;
    }
    public double gain(double p,double t){
        return (p+1)/(t+1)-(p)/(t);
    }
}
