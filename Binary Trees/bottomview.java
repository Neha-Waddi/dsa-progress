import java.util.*;

// Definition for binary tree node
class Node {
    int data;
    Node left, right;
    Node(int item) {
        data = item;
        left = right = null;
    }
}
class Pair{
    Node node;
    int x;
    public Pair(Node node,int x){
        this.node=node;
        this.x=x;
    }
}

class Solution {
    // Function to return a list containing the bottom view of the given tree.
    public ArrayList<Integer> bottomView(Node root) {
        // Code here
        ArrayList<Integer> res=new ArrayList<>();
        Map<Integer,Integer> map=new TreeMap<>();
        Queue<Pair> q=new LinkedList<>();
        
        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            Pair curr=q.poll();
            Node temp=curr.node;
            int x=curr.x;
            map.put(x,temp.data);
            
            if(temp.left!=null) q.offer(new Pair(temp.left,x-1));
            if(temp.right!=null) q.offer(new Pair(temp.right,x+1));
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            res.add(entry.getValue());
        }
        return res;
    }
}