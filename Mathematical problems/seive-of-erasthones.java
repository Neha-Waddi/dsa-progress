import java.util.*;
class Solution {
    static ArrayList<Integer> sieveOfEratosthenes(int n) {
        // code here
        boolean[] isPrime=new boolean[n+1];
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<=n;i++){
            isPrime[i]=true;
        }
        for(int p=2;p*p<=n;p++){
            if(isPrime[p]==true){
                for(int i=p*p;i<=n;i+=p){
                    isPrime[i]=false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                res.add(i);
            }
        }
        return res;
    }
}