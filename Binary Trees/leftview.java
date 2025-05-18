import java.util.*;
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
class Solution {
    // Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        if(root==null)
        return res;
        
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
            int level_size=q.size();
            for(int i=0;i<level_size;i++){
                Node curr=q.poll();
                if(i==0)
                res.add(curr.data);
                
                if(curr.left!=null) q.offer(curr.left);
                if(curr.right!=null) q.offer(curr.right);
                
            }
        }
        return res;
    }
}