import java.util.HashMap;
import java.util.Map;

public class subarrSumdivK {
    public int subarraysDivByK(int[] nums, int k) {
        int sum=0;
        Map<Integer,Integer> mp=new HashMap<>();

        int count=0;
        mp.put(0,1);

        for(int i=0;i<nums.length;i++){
            sum=(sum+nums[i])%k;
            if(sum<0) sum+=k;

            if(mp.containsKey(sum)){
                count+=mp.get(sum);
            }
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
