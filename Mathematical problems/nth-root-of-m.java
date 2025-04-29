
class Solution {
    public int nthRoot(int n, int m) {
        // code here
       int low = 1, high = m;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long pow = power(mid, n);

            if (pow == m) {
                return mid;
            } else if (pow < m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
     private long power(int a, int b) {
        long res = 1;
        for (int i = 0; i < b; i++) {
            res *= a;
      
        }
        return res;
    }
}