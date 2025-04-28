import java.util.*;
class Solution {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        int left = 0;
        Map<Character, Integer> freq = new HashMap<>();
        Map<String, Integer> occurrences = new HashMap<>();
        int count = 0;

        for (int right = 0; right < s.length(); right++) {
            freq.put(s.charAt(right), freq.getOrDefault(s.charAt(right), 0) + 1);

            if (right - left + 1 > minSize) {
                freq.put(s.charAt(left), freq.get(s.charAt(left)) - 1);
                if (freq.get(s.charAt(left)) == 0) {
                    freq.remove(s.charAt(left));
                }
                left++;
            }

            if (right - left + 1 == minSize && freq.size() <= maxLetters) {
                String substring = s.substring(left, right + 1);
                occurrences.put(substring, occurrences.getOrDefault(substring, 0) + 1);
                count = Math.max(count, occurrences.get(substring));
            }
        }

        return count;
    }
}
