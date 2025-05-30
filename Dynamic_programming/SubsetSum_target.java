package Dynamic_programming;

import java.util.*;
public class SubsetSum_target {
    static Boolean isSubsetSum(int arr[], int sum) {
        int[][] dp = new int[arr.length][sum + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return check(arr, dp, arr.length - 1, sum) == 1;
    }

    static int check(int arr[], int[][] dp, int index, int target) {
        if (target == 0) return 1;
        if (index == 0) return arr[0] == target ? 1 : 0;

        if (dp[index][target] != -1) return dp[index][target];

        int not = check(arr, dp, index - 1, target);
        int take = 0;
        if (target >= arr[index]) take = check(arr, dp, index - 1, target - arr[index]);

        return dp[index][target] = (take == 1 || not == 1) ? 1 : 0;
    }
}
