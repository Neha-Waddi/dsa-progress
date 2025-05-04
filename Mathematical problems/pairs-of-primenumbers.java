
class Solution {
    public int[] prime_pairs(int n) {
        int[] res = new int[n * n]; 
        int idx = 0;

        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {
                for (int j = 2; j <= n; j++) {
                    if (isprime(j) && i * j <= n) {
                        res[idx++] = i;
                        res[idx++] = j;
                    }
                }
            }
        }

        int[] copy = new int[idx];
        for (int i = 0; i < idx; i++) {
            copy[i] = res[i];
        }

        return copy;
    }

    public boolean isprime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
