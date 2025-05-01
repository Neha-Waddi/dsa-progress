//Find the longest continuous sub array that has exactly 2 distinct elements
import java.util.*;
class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> freq = new HashMap<>();
        int left = 0, max = 0;
        for (int i = 0; i < fruits.length; i++) {
            freq.put(fruits[i], freq.getOrDefault(fruits[i], 0) + 1);
            while (freq.size() > 2) {
                freq.put(fruits[left], freq.get(fruits[left]) - 1);
                if (freq.get(fruits[left]) == 0) {
                    freq.remove(fruits[left]);
                }
                left++;
            }

            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}
