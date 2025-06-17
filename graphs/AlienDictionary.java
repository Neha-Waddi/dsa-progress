package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AlienDictionary {
    public String findOrder(String[] words) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            adj.add(new ArrayList<>());
        }

        boolean[] present = new boolean[26]; 
        for (String word : words) {
            for (char c : word.toCharArray()) {
                present[c - 'a'] = true;
            }
        }

    
        for (int i = 0; i < words.length - 1; i++) {
            String a = words[i];
            String b = words[i + 1];
            int n = Math.min(a.length(), b.length());

            boolean found = false;
            for (int p = 0; p < n; p++) {
                if (a.charAt(p) != b.charAt(p)) {
                    adj.get(a.charAt(p) - 'a').add(b.charAt(p) - 'a');
                    found = true;
                    break;
                }
            }

            if (!found && a.length() > b.length()) {
                return "";
            }
        }

        int[] indegree = new int[26];
        for (int i = 0; i < 26; i++) {
            for (int neighbor : adj.get(i)) {
                indegree[neighbor]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < 26; i++) {
            if (present[i] && indegree[i] == 0) {
                q.offer(i);
            }
        }

        StringBuilder res = new StringBuilder();
        while (!q.isEmpty()) {
            int u = q.poll();
            res.append((char)(u + 'a'));

            for (int v : adj.get(u)) {
                indegree[v]--;
                if (indegree[v] == 0) {
                    q.offer(v);
                }
            }
        }

        for (int i = 0; i < 26; i++) {
            if (present[i] && indegree[i] != 0) {
                return ""; 
            }
        }

        return res.toString();
    }
}
