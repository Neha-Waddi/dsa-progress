class Solution {
    static int largestPrimeFactor(int n) {
        // code here
        int start=2;
        while(start*start<=n){
            if(n%start==0){
                n=n/start;
            }
            else{
                start++;
            }
        }
        return n;
    }
}