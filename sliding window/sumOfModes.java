import java.util.*;
public class sumOfModes {
public int sumOfmodes(int[] arr, int k) {
        // code here
        int n=arr.length;
        
        Map<Integer,Integer> mp=new HashMap<>();
        TreeSet<int[]> ts=new TreeSet<>(new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                if(a[0]!=b[0]){
                    return Integer.compare(a[0],b[0]);
                }
                return Integer.compare(a[1],b[1]);
            }
        });
        
        for(int i=0;i<k;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            ts.add(new int[]{entry.getValue(),-entry.getKey()});
        }
        
        int mode=-ts.last()[1];
        int sum=mode;
        
        for(int i=k;i<n;i++){
            int out=arr[i-k];
            int in=arr[i];
            
            int outfreq=mp.get(out);
            ts.remove(new int[]{outfreq,-out});
            
            mp.put(out,outfreq-1);
            if(outfreq>0){
                ts.add(new int[]{outfreq-1,-out});
            }
            else{
                mp.remove(out);
            }
            mp.put(in,mp.getOrDefault(in,0)+1);
            ts.add(new int[]{mp.get(in),-in});
            
            mode=-ts.last()[1];
            sum+=mode;
            
        }
        return sum;
        
    }
}