//in sqrt(n) 
class Solution {
    static boolean isPerfectNumber(int n) {
        if (n == 1) return false;  
        
        int sum = 1;  
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                int divisorPair = n / i;
                if (divisorPair != i) {
                    sum += divisorPair;
                }
            }
        }
        
        return sum == n;
    }
}
