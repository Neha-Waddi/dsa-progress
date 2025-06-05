class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

//optimised
public class Inorder_succ {
    public int inorderSuccessor(Node root, Node x) {
        // add code here.
        int succ=-1;
        while(root!=null){
            if(root.data>x.data){
                succ=root.data;
                root=root.left;
            }
            else{
                root=root.right;
            }
        }
        return succ;
    }
}


// class Solution {
//     // returns the inorder successor of the Node x in BST (rooted at 'root')
//     boolean found=false;
//     int res=-1;
//     public int inorderSuccessor(Node root, Node x) {
//         // add code here.
//         inorder(root,x);
//         return res;
        
//     }
//     public void inorder(Node root,Node x){
//         if(root==null) return;
        
//         inorder(root.left,x);
        
//         if(found==true && res==-1){
//         res=root.data;
//         return;
//         }
        
//         if(root.data==x.data)
//         found=true;
        
//         inorder(root.right,x);
//     }
// }