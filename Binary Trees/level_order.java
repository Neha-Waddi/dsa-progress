//bfs
import java.util.*;
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;

        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int level_size=q.size();
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<level_size;i++){
                TreeNode curr=q.poll();
                temp.add(curr.val);
                if(curr.left!=null)
                q.offer(curr.left);
                if(curr.right!=null)
                q.offer(curr.right);

            }
            res.add(temp);
        }
        return res;
    }
}