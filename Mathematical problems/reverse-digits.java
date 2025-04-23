class Solution {
    public int reverseDigits(int n) {
        // Code here
        int res=0;
        while(n>0){
            int digit=n%10;
            res=res*10+digit;
            n=n/10;
        }
        return res;
    }
}