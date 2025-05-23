package Dynamic_programming;

public class Delete_and_earn {
  public int mincostTickets(int[] days, int[] costs) {
        int n=days.length;
        int[] dp=new int[n+1];

        for(int i=n-1;i>=0;i--){
            int one=costs[0]+dp[get_index(days,i,days[i]+1)];
            int seven=costs[1]+dp[get_index(days,i,days[i]+7)];
            int thirty=costs[2]+dp[get_index(days,i,days[i]+30)];

            dp[i]=Math.min(one,Math.min(seven,thirty));
        }
        return dp[0];
    }
    public int get_index(int[] days,int i,int target){
        int j=i;
        while(j<days.length && days[j]<target) j++;
        
        return j;
    }  
}
