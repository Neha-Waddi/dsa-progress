package puzzles;

// You are given a list of q queries, and for each query, an integer n is provided. The task is to find how many numbers less than or equal to n have exactly 3 divisors.

// Examples:

// Input: q = 1
//           query[0] = 6
// Output: 1
// Explanation: There is only one number 4 which has exactly three divisors 1, 2 and 4 and less than equal to 6.
// Input: q = 2
//        query[0] = 6
//        query[1] = 10
// Output: 1
//         2
// Explanation: For query 1 it is covered in the example 1. query 2:There are two numbers 4 and 9 having exactly 3 divisors and less than 
// equal to 10.

//approach-

// A number x has exactly 3 divisors if and only if:

// x = p^2 where p is a prime number

// Why?
// If x = p^2, its divisors are {1, p, p^2} → 3 divisors.

// If x is any other number, it typically has more or fewer than 3 divisors unless it’s a square of a prime.



import java.util.*;
class Solution {
    static ArrayList<Integer> primes = new ArrayList<>();

    static ArrayList<Integer> threeDivisors(ArrayList<Long> query, int q) {
        ArrayList<Integer> res = new ArrayList<>();

        
        long max = 0;
        for (long x : query) {
            if (x > max)
                max = x;
        }

        
        primes((int) Math.sqrt(max));

        
        for (long n : query) {
            int count = 0;
            for (int p : primes) {
                if ((long) p * p <= n)
                    count++;
                else
                    break;
            }
            res.add(count);
        }

        return res;
    }

    static void primes(int limit) {
        boolean[] isprime = new boolean[limit + 1];
        Arrays.fill(isprime, true);
        isprime[0] = isprime[1] = false;

        for (int i = 2; i * i <= limit; i++) {
            if (isprime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isprime[j] = false;
                }
            }
        }

        primes.clear(); 
        for (int i = 2; i <= limit; i++) {
            if (isprime[i])
                primes.add(i);
        }
    }
}
