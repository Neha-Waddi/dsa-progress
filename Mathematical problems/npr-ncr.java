class Solution {
    static long nPr(long n, long r) {
        // code here
        long numer=factorial(n);
        long denom=factorial(n-r);
        return numer/denom;
        
    }
    static long factorial(long num){
        if(num==0 || num==1)
        return 1;
        
        return num*factorial(num-1);
    }
    static long nCr(int n, int r) {
        if (r > n) return 0;
        if (r > n - r) r = n - r;  // Use symmetry

        long result = 1;

        for (int i = 1; i <= r; i++) {
            result = result * (n - i + 1) / i;
        }

        return result;
    }
}