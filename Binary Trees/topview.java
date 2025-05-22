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
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        if(root==null) return res;
        
        Queue<Pair> q=new LinkedList<>();
        q.offer(new Pair(root,0));
        
        Map<Integer,Integer> map=new TreeMap<>();
        
        
        while(!q.isEmpty()){
            Pair curr=q.poll();
            Node node=curr.node;
            int x=curr.x;
            
            if(!map.containsKey(x)) map.put(x,node.data);
            
            if(node.left!=null) q.offer(new Pair(node.left,x-1));
            if(node.right!=null) q.offer(new Pair(node.right,x+1));
            
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            res.add(entry.getValue());
        }
        return res;
        
    }
}