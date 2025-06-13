package greedy;

public class Lemonade {
     public boolean lemonadeChange(int[] bills) {
        int[] coins=new int[3];
        for(int b:bills){
            if(b==5){ 
                coins[0]++;
            }
            else if(b==10){
                coins[1]++;
                if(coins[0]!=0)
                coins[0]--;
                else
                return false;
            }
            else {
                if(coins[1]>0 && coins[0]>0){
                    coins[1]--;
                    coins[0]--;
                }
                else if(coins[0]>=3){
                    coins[0]-=3;
                }
                else
                return false;
            };
        }
        return true;
   

    }
}
