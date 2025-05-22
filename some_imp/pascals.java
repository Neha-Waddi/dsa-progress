package some_imp;

import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            
            for (int j = 0; j <= i; j++) {
                // First and last elements in each row are 1
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    // Middle elements are sum of the two above
                    int val = res.get(i - 1).get(j - 1) + res.get(i - 1).get(j);
                    row.add(val);
                }
            }
            res.add(row);
        }
        
        return res;
    }
}
