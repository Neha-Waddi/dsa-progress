
class Solution {
    public static int gcd(int a, int b) {
        // code here
        return calc(a,b);
        
    }
    public static int calc(int a,int b){
        if(b==0)
        return a;
        else{
            return calc(b,a%b);
        }
    }
}
