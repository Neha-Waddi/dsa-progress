import java.util.HashMap;
import java.util.Map;

public class LargestSumwithZero {
    int maxLen(int arr[]) {
        // code here
        Map<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        int sum=0;
        int max=0;
        
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            if(sum==0){
                max=Math.max(max,i+1);
            }
            else if(map.containsKey(sum)){
                max=Math.max(max,i-map.get(sum));
            }
            else{
                map.put(sum,i);
            }
        }
        return max;
    }
}
