package Dynamic_programming;

public class Decode_ways {
    public int numDecodings(String s) {
        int n=s.length();
        int[] dp=new int[n+1];
        dp[0]=1;
        if(s.charAt(0)=='0') dp[1]=0;
        else dp[1]=1;

        for(int i=2;i<=n;i++){
            int way1=0,way2=0;
            if(s.charAt(i-1)!='0') 
            way1=dp[i-1];

            if(Integer.valueOf(s.substring(i-2,i))>=10 && Integer.valueOf(s.substring(i-2,i))<=26)
            way2=dp[i-2];

            dp[i]=way1+way2;
        }
        return dp[n];

    }

}
