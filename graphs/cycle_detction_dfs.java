package graphs;

import java.util.ArrayList;
import java.util.List;

public class cycle_detction_dfs {
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
                if (dfs(i, adj, vis, -1)) return true;
            }
        }

        return false;
    }

    public boolean dfs(int node, List<List<Integer>> adj, int[] vis, int parent) {
        vis[node] = 1;

        for (int neighbor : adj.get(node)) {
            if (vis[neighbor] == 0) {
                if (dfs(neighbor, adj, vis, node)) return true; 
            } else if (neighbor != parent) {
                return true;
            }
        }

        return false;
    }
}
