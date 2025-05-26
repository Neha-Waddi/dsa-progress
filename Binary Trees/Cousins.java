import java.util.*;

public class Cousins {
    public boolean isCousins(TreeNode root, int x, int y) {
      
        Queue<TreeNode> q =new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            boolean got_x=false;
            boolean got_y=false;
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                if(curr.left!=null && curr.right!=null){
                    if((curr.left.val==x && curr.right.val==y)||(curr.left.val==y && curr.right.val==x)){
                        return false;
                    }
                }
                if(curr.left!=null){
                    q.offer(curr.left);
                    if(curr.left.val==x) got_x=true;
                    if(curr.left.val==y) got_y=true;
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                    if(curr.right.val==x) got_x=true;
                    if(curr.right.val==y) got_y=true;
                }
                
            }
            if(got_x && got_y) return true;
            if(got_x || got_y) return false;
           
        }
            return false;

    }
}
