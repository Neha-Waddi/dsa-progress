package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReduceSizeToHalf {
    public int minSetSize(int[] arr) {
        int max = 0;
        for (int num : arr) {
            max = Math.max(max, num);
        }
        int[] count = new int[max + 1];
        for (int num : arr) {
            count[num]++;
        }
        List<Integer> frequencies = new ArrayList<>();
        for (int c : count) {
            if (c > 0) frequencies.add(c);
        }
        frequencies.sort(Collections.reverseOrder());

        int removed = 0, sets = 0;
        int half = arr.length / 2;
        for (int freq : frequencies) {
            removed += freq;
            sets++;
            if (removed >= half) break;
        }

        return sets;
    }
}
