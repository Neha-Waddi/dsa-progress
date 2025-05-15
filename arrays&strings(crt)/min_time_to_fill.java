//min time taken to fill cups 

class Solution {
    public int fillCups(int[] amount) {
        int max=amount[0];
        int sum=0;
        for(int i:amount){
            if(i>max){
                max=i;
            }
            sum+=i;
        }
        return Math.max((sum+1)/2 , max);
    }
}


/* 
🔍 Why Math.max((sum + 1)/2, max)?
There are two constraints:

You can’t go faster than max cups of any single type.

Ex: [1, 0, 8] → must spend at least 8 seconds for hot cups.

But if demands are balanced, you can fill 2 at a time.

Ex: [4, 4, 2] → total 10 → can do in 5 seconds.

So we take the maximum of:

(sum + 1)/2: best-case (optimistic)

max: worst-case single type (realistic limit)

*/