
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}


class Solution {
    // Return the root of the modified tree after removing all the half nodes.
    public Node RemoveHalfNodes(Node root) {
        // Code Here
       return check(root);
        
    }
    public Node check(Node root){
        
        if(root==null) return null;
        
        root.left=check(root.left);
        root.right=check(root.right);
        
        if(root.left==null && root.right!=null) return root.right;
        if(root.right==null && root.left!=null) return root.left;
        
        return root;
        
    }
}
