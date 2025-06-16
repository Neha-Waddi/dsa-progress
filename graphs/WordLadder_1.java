package graphs;
import java.util.*;

class Pair{
    String word;
    int step;
    Pair(String word,int step){
        this.word=word;
        this.step=step;
    }
}
public class WordLadder_1 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)) return 0;

        Set<String> set=new HashSet<>(wordList);
        Queue<Pair> q=new LinkedList<>();
        q.offer(new Pair(beginWord,1));
        set.remove(beginWord);

        while(!q.isEmpty()){
            Pair front=q.poll();
            String word=front.word;
            int step=front.step;

            if(word.equals(endWord)) return step;
            for(int i=0;i<word.length();i++){
                for(char c='a';c<='z';c++){
                    char[] transform=word.toCharArray();
                    transform[i]=c;
                    String new_str=new String(transform);
                    if(set.contains(new_str)){
                        q.offer(new Pair(new_str,step+1));
                        set.remove(new_str);
                    }
                }
            }
        }
        return 0;
    }
}