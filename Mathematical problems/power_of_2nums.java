public class power_of_2nums {
     public int reverseExponentiation(int n) {
        // code here
        
        return pow(n,rev(n));
    }
    public int rev(int num){
        int rev=0;
        while(num>0){
            rev=rev*10+(num%10);
            num=num/10;
        }
        return rev;
    }
    public int pow(int n,int x){
        int res=1;
        
        while(x>0){
            if((x&1) ==1){
                res=res*n;
            }
            n=n*n;
            x=x/2;
        }
        return res;
    }
}
