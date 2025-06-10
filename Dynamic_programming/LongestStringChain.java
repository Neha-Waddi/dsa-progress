package Dynamic_programming;

import java.util.*;

public class LongestStringChain {
    public int longestStrChain(String[] words) {
        int n=words.length;
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        int max=1;

        Arrays.sort(words,(a,b)->a.length()-b.length());
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(check(words[i],words[j])){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            max=Math.max(max,dp[i]);
        }
        return max;
    }
    public boolean check(String s,String t){
        if(s.length()!=t.length()+1) return false;
        int i=0;
        int j=0;
        while(i<s.length()){
            if(j<t.length() && s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        if(i==s.length() && j==t.length()) return true;
        return false;
    }
}
