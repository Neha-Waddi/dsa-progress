package graphs;

import java.util.List;
import java.util.PriorityQueue;

public class prims {
    static int spanningTree(int V, int E, List<List<int[]>> adj) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]); // {weight, node}
        boolean[] vis = new boolean[V];

        pq.offer(new int[]{0, 0}); 

        int sum = 0;
        while (!pq.isEmpty()) {
            int[] front = pq.poll();
            int wt = front[0];
            int node = front[1];

            if (vis[node]) continue;

            vis[node] = true;
            sum += wt;

            for (int[] edge : adj.get(node)) {
                int neighbor = edge[0];
                int edgeWeight = edge[1];
                if (!vis[neighbor]) {
                    pq.offer(new int[]{edgeWeight, neighbor});
                }
            }
        }

        return sum;
    }
}
