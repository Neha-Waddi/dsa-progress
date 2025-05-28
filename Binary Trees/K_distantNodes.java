
import java.util.*;
class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }
  
class Solution {
    Map<TreeNode,TreeNode> map=new HashMap<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        buildParent(root,null);

        List<Integer> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        Set<TreeNode> visited=new HashSet<>();
        q.offer(target);
        visited.add(target);
        int dist=0;
        while(!q.isEmpty()){
            int size=q.size();
            if(dist==k){
                for(int i=0;i<size;i++){
                    res.add(q.poll().val);
                }
                return res;
            }
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                if(curr.left!=null && !visited.contains(curr.left)){
                    q.offer(curr.left);
                    visited .add(curr.left);
                }
                if(curr.right!=null && !visited.contains(curr.right)){
                    q.offer(curr.right);
                    visited .add(curr.right);
                }
                TreeNode par=map.get(curr);
                if(par!=null && !visited.contains(par)){
                    q.offer(par);
                    visited .add(par);
                }
            }
            dist++;

        }
        return res;

    }
    public void buildParent(TreeNode node,TreeNode parent){
        if(node==null) return;
        map.put(node,parent);
        buildParent(node.left,node);
        buildParent(node.right,node);

    }
}