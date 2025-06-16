package graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class No_of_distinct_islands {
     Set<List<String>> set = new HashSet<>();

    int countDistinctIslands(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] vis = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (vis[i][j] == 0 && grid[i][j] == 1) {
                    List<String> island = new ArrayList<>();
                    dfs(i, j, island, grid, vis, i, j);
                    set.add(island);
                }
            }
        }

        return set.size();
    }

    void dfs(int i, int j, List<String> island, int[][] grid, int[][] vis, int base_i, int base_j) {
        int m = grid.length;
        int n = grid[0].length;

        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 0 || vis[i][j] == 1)
            return;

        vis[i][j] = 1;
        island.add((i - base_i) + ":" + (j - base_j));  

        dfs(i - 1, j, island, grid, vis, base_i, base_j);
        dfs(i, j - 1, island, grid, vis, base_i, base_j);
        dfs(i + 1, j, island, grid, vis, base_i, base_j);
        dfs(i, j + 1, island, grid, vis, base_i, base_j);
    }
}
