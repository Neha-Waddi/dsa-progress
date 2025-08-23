import java.util.*;

public class nodesDIstK {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> res=new ArrayList<>();
        Map<TreeNode,TreeNode> par=new HashMap<>();
        Map<TreeNode,Boolean> vis=new HashMap<>();

        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(curr.left!=null) {
                q.offer(curr.left);
                par.put(curr.left,curr);
            }
            if(curr.right!=null){
                q.offer(curr.right);
                par.put(curr.right,curr);
            }
        }

        Queue<TreeNode> qu=new LinkedList<>();
        qu.offer(target);
        int count=0;
        vis.put(target,true);

        while(!qu.isEmpty()){
            int size=qu.size();
            for(int i=0;i<size;i++){
                TreeNode curr=qu.poll();

                if(count==k) res.add(curr.val);

                if(curr.left!=null && !vis.containsKey(curr.left)){
                    qu.offer(curr.left);
                    vis.put(curr.left,true);
                }
                if(curr.right!=null && !vis.containsKey(curr.right)){
                    qu.offer(curr.right);
                    vis.put(curr.right,true);
                }
                if(par.containsKey(curr) && !vis.containsKey(par.get(curr))){
                    qu.offer(par.get(curr));
                    vis.put(par.get(curr),true);
                }
            }
            if(count==k) break;
            count++;
        }
        return res;
    }
}
