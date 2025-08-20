import java.util.*;

public class subarrayZeroSum {
     static boolean findsum(int arr[]) {
        // Your code here
        int sum=0;
        Set<Integer> set=new HashSet<>();
        
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0 || arr[i]==0 ||set.contains(sum))
            return true;
            
            set.add(sum);
            
        }
        return false;
    }
}
