package Queue;

import java.util.*;class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n=deck.length;
        int[] res=new int[n];
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            q.offer(i);
        }
        int idx=0;
        while(!q.isEmpty()){
            res[q.poll()]=deck[idx++];
            if(!q.isEmpty()){
            q.offer(q.poll());
            }
        }
        return res;

    }
}