package greedy;
import java.util.*;

public class Min_no_ofCoins {
    static List<Integer> minPartition(int N) {
        // code here
        List<Integer> res=new ArrayList<>();
        int[] currency={2000,500,200,100,50,20,10,5,2,1};
      
        for(int i=0;i<currency.length;i++){
            if(N/currency[i]<=0) continue;
            
            while(N/currency[i] >0){
                res.add(currency[i]);
                N=N-currency[i];
            }
        }
        return res;
    }
}
