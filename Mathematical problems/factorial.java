
class Solution {
    static int factorial(int n) {
        // code here
        return fact(n);
        
    }
    static int fact(int n){
        if(n==0 || n==1)
        return 1;
        
        return n*fact(n-1);
        
    }
}