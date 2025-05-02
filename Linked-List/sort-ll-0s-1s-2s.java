class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
class Solution {
    static Node segregate(Node head) {
        // code here
        int zero=0,one=0,two=0;
        Node curr=head;
        while(curr!=null){
            if(curr.data==0){
                zero++;
            }
            else if(curr.data==1){
                one++;
            }
            else{
                two++;
            }
            curr=curr.next;
        }
        Node res=new Node(0);
        Node res_p=res;
        while(zero-- >0){
            res.next=new Node(0);
            res=res.next;
        }
        while(one-- >0 ){
            res.next=new Node(1);
            res=res.next;
        }
        while(two-- > 0){
            res.next=new Node(2);
            res=res.next;
        }
        return res_p.next;
    }
}