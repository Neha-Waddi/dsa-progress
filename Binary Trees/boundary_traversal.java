import java.util.*;
 class TreeNode {
       int data;
       TreeNode left;
       TreeNode right;
       TreeNode(int val) { data = val; left = null;right = null; }
   }


class Solution {
    List<Integer> res=new ArrayList<>();
    public List<Integer> boundary(TreeNode root) {
        //your code goes here
        res.add(root.data);
        left(root.left);
        bottom(root);
        right(root.right);
        return res;

    }
    public void left(TreeNode root){
        if(root==null || check(root)) return;

        res.add(root.data);
        if(root.left!=null)
        left(root.left);
        else
        left(root.right);

    }
    public void bottom(TreeNode root){
        if(root.left==null && root.right==null) res.add(root.data) ;
        
        if(root.left!=null)
        bottom(root.left);
        if(root.right!=null)
        bottom(root.right);

    }
    public void right(TreeNode root){

        Stack<Integer> st=new Stack<>();
        while(root!=null){
            if(!check(root))
            st.push(root.data);

            if(root.right!=null) root=root.right;
            else root=root.left;
        }
        while(!st.isEmpty()){
            res.add(st.pop());
        }

    }
    public boolean check(TreeNode root){
        if(root.left==null && root.right==null)
        return true;

        return false;
    }

}