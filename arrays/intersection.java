import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class intersection {
    public ArrayList<Integer> intersect(int[] a, int[] b) {
        // code here
        Set<Integer> aset=new HashSet<>();
        for (int num : a) {
            aset.add(num);
        }
        
        Set<Integer> ans_set=new HashSet<>();
        ArrayList<Integer> res=new ArrayList<>();
        
        for(int num:b){
            if(aset.contains(num) && !res.contains(num)){
                ans_set.add(num);
                res.add(num);
            }
        }
        return res;
    }
}
