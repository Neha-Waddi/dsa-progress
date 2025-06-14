package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class cycle_detection_bfs {
    public boolean isCycle(int V, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int[] vis = new int[V];

        for (int i = 0; i < V; i++) {
            if (vis[i] == 0) {
                if (bfs(i, adj, vis)) return true;
            }
        }

        return false;
    }

    private boolean bfs(int start, List<List<Integer>> adj, int[] vis) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{start, -1});
        vis[start] = 1;

        while (!q.isEmpty()) {
            int[] front = q.poll();
            int node = front[0];
            int parent = front[1];

            for (int neighbor : adj.get(node)) {
                if (vis[neighbor] == 0) {
                    vis[neighbor] = 1;
                    q.offer(new int[]{neighbor, node});
                } else if (neighbor != parent) {
                    return true;
                }
            }
        }

        return false;
    }
}
