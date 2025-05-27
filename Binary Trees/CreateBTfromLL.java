import java.util.LinkedList;
import java.util.Queue;
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int d) {
        data = d;
        left = null;
        right = null;
    }
}

// Linked List Node class
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class CreateBTfromLL{
        // code here
       public TreeNode linkedListToBinaryTree(Node head) {
        // code here
        Node temp=head;
        TreeNode root=new TreeNode(temp.data);
        temp=temp.next;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(temp!=null){
            TreeNode curr=q.poll();
            TreeNode left=null,right=null;
            if(temp!=null){
                left=new TreeNode(temp.data);
                q.offer(left);
                temp=temp.next;
            }
            if(temp!=null){
                right=new TreeNode(temp.data);
                q.offer(right);
                temp=temp.next;
            }
            curr.left=left;
            curr.right=right;

        }
        return root;
    }
}