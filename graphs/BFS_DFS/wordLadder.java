package graphs.BFS_DFS;

import java.util.*;

class Pair{
    String word;
    int steps;
    Pair(String word,int steps){
        this.word=word;
        this.steps=steps;
    }
}

public class wordLadder {
     public int wordLadderLength(String startWord, String targetWord,
                                String[] wordList) {
        // Code here
        Set<String> set=new HashSet<>();
        for(String s :wordList) set.add(s);
        
        if(!set.contains(targetWord)) return 0;
        
        Queue<Pair> q=new LinkedList<>();
        q.offer(new Pair(startWord,1));
        set.remove(startWord);
        
        while(!q.isEmpty()){
            Pair front=q.poll();
            String s=front.word;
            int steps=front.steps;
            
            if(s.equals(targetWord)) return steps;
            for(int i=0;i<s.length();i++){
                for(char c='a';c<='z';c++){
                    char[] s_arr=s.toCharArray();
                    s_arr[i]=c;
                    String new_s=new String(s_arr);
                    
                    if(set.contains(new_s)){
                        q.offer(new Pair(new_s,steps+1));
                        set.remove(new_s);
                    }
                }
            }
        }
        
        return 0;
    }
}
