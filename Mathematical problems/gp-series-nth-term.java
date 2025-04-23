class Solution
{
    public int Nth_term(int a, int r, int n)
    {
        // code here
        int MOD = 1000000007;
        
        long result = 1;
        long base = r;
        int exponent = n - 1;
        
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exponent /= 2;
        }
        result = (result * a) % MOD;
        
        return (int) result;
    }
}