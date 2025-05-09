package puzzles;

//approach 1

class Solution {
    static int countSquares(int n) {
        int count = 0;
        for (int i = 1; i * i < n; i++) {
            count++;
        }
        return count;
    }
}

//approach 2



// User function Template for Java

class Solution2 {
    static int countSquares(int n) {
        
        return (int)(Math.sqrt(n-1));
    }
}