package graphs;

public class floydWarshall {
    public void floydWarshallalgo(int[][] dist) {
        int n = dist.length;
        int INF = 100000000; 

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dist[i][k] != INF && dist[k][j] != INF) {
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                    }
                }
            }
        }

       // no need to replace unreachable distances with -1
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         if (dist[i][j] == INF) {
        //             dist[i][j] = -1;
        //         }
        //     }
        // }
    }
}
