import java.util.HashMap;
import java.util.Map;

 class Node{
    int key;
    int value;
    Node prev;
    Node next;
    Node(int key,int value){
        this.key=key;
        this.value=value;
        this.next=null;
        this.prev=null;
    }
}

public class LRU {
   

class LRUCache {

    int cap;
    Map<Integer,Node> mp;
    Node head;
    Node tail;

    public LRUCache(int capacity) {
        this.cap=capacity;
        mp=new HashMap<>();
        head=new Node(0,0);
        tail=new Node(0,0);

        head.next=tail;
        tail.prev=head;
    }

    public void remove(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }

    public void insertHead(Node node){
        node.next=head.next;
        head.next.prev=node;
        head.next=node;
        node.prev=head;
    }
    
    public int get(int key) {
        if(mp.containsKey(key)){
            Node node=mp.get(key);
            remove(node);
            insertHead(node);
            return node.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(mp.containsKey(key)){
            Node node=mp.get(key);
            remove(node);
            node.value=value;
            insertHead(node);
        }
        else{
            if(mp.size()==cap){
                Node lru=tail.prev;
                remove(lru);
                mp.remove(lru.key);
            }
            Node node=new Node(key,value);
            insertHead(node);
            mp.put(key,node);
        }
    }
}

}
