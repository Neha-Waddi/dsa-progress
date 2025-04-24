// Given two numbers a and b, find kth digit from right of ab.

// Example 1:

// Input: a = 3, b = 3, k = 1
// Output: 7
// Explanation: 33 = 27 and 1st digit from right is 7
// Input: a = 5, b = 2, k = 2
// Output: 2
// Explanation: 52 = 25 and second digit from right is 2.
// Constraints:
// 1 <= a,b <= 15
// 1 <= k <= digits in ab



class Solution {
    static long kthDigit(int a, int b, int k) {
        // code here
        long num=(long)Math.pow(a,b);
        for(int i=1;i<=k-1;i++){
            num=num/10;
        }
        return num%10;
        
    }
    
}