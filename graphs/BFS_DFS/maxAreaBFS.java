package graphs.BFS_DFS;

import java.util.LinkedList;
import java.util.Queue;

public class maxAreaBFS {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] vis = new boolean[m][n];

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && !vis[i][j]) {
                    int area = 0;
                    Queue<int[]> q = new LinkedList<>();
                    q.offer(new int[]{i, j});
                    vis[i][j] = true;

                    while (!q.isEmpty()) {
                        int[] cell = q.poll();
                        area++;

                        for (int d = 0; d < 4; d++) {
                            int ni = cell[0] + dx[d];
                            int nj = cell[1] + dy[d];

                            if (ni >= 0 && nj >= 0 && ni < m && nj < n &&
                                grid[ni][nj] == 1 && !vis[ni][nj]) {
                                q.offer(new int[]{ni, nj});
                                vis[ni][nj] = true;
                            }
                        }
                    }

                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        return maxArea;
    }
}
