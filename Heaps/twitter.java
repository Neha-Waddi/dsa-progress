
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

class Node{
    int id;
    int time;
    Node next;
    Node(int id,int time){
        this.id=id;
        this.time=time;
        this.next=null;
    }
}

public class twitter {
    int time;
    HashMap<Integer,Node> posts;
    HashMap<Integer,Set<Integer>> foll;

    public void Twitter() {
        posts=new HashMap<>();
        foll=new HashMap<>();
        time=0;
    }
    
    public void postTweet(int userId, int tweetId) {
        Node post=new Node(tweetId,time++);
        post.next=posts.get(userId);
        posts.put(userId,post);

        foll.putIfAbsent(userId,new HashSet<>());
    }
    
    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<Node> pq=new PriorityQueue<>((a,b)->b.time-a.time);
        if(!foll.containsKey(userId)) 
        foll.put(userId,new HashSet<>());

        Set<Integer> users=new HashSet<>(foll.get(userId));
        users.add(userId);

        for(int u:users){
            if(posts.containsKey(u)){
                pq.offer(posts.get(u));
            }
        }
        List<Integer> res=new ArrayList<>();
        while(!pq.isEmpty() && res.size()<10){
            Node post=pq.poll();
            res.add(post.id);
            if(post.next!=null){
                post=post.next;
                pq.offer(post);
            }
        }
        return res;

    }
    
    public void follow(int followerId, int followeeId) {
        if(!foll.containsKey(followerId)){
            foll.put(followerId,new HashSet<>());
        }
        foll.get(followerId).add(followeeId);

    }
    
    public void unfollow(int followerId, int followeeId) {
        if(foll.containsKey(followerId)){
            foll.get(followerId).remove(followeeId);
        }
    }
}
