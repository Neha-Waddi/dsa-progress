import java.util.*;
class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode() {}
       TreeNode(int val) { this.val = val; }
       TreeNode(int val, TreeNode left, TreeNode right) {
           this.val = val;
           this.left = left;
           this.right = right;
       }
   }

class Pair{
    TreeNode node;
    int idx;
    Pair(TreeNode node,int idx){
        this.node=node;
        this.idx=idx;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int max=0;
        Queue<Pair> q=new LinkedList<>();
        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            int size=q.size();
            int diff=q.peek().idx;
            int left=0;
            int right=0;

            for(int i=0;i<size;i++){

                int curr=q.peek().idx-diff;
                TreeNode temp=q.peek().node;
                q.poll();
 
                if(i==0) left=curr;
                if(i==size-1) right=curr;

                if(temp.left!=null)
                q.offer(new Pair(temp.left,2*curr+1));

                if(temp.right!=null)
                q.offer(new Pair(temp.right,2*curr+2));
            max=Math.max(max,right-left+1);

            }


        }
        return max;
    }
}