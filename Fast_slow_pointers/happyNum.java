package Fast_slow_pointers;

public class happyNum {
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;

        do{
            slow=solve(slow);
            fast=solve(solve(fast));

        }while(slow!=fast);

        return slow==1;
    }
    public int solve(int n){
        int res=0;
        while(n>0){
            int dig=n%10;
            res+=dig*dig;
            n/=10;
        }
        return res;
    }
}
