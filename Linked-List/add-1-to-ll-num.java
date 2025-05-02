
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
class Solution {
    public Node addOne(Node head) {
        // code here.
        head=reverse(head);
        int carry=1;
        Node curr=head;
        while(curr!=null){
            int sum=curr.data+carry;
            curr.data=sum%10;
            carry=sum/10;
            if(carry==0) break;
            if(carry>0 && curr.next==null){
                curr.next=new Node(0);
            }
            curr=curr.next;
        }
        return reverse(head);
      
    }
     Node reverse(Node head){
        Node prev=null;
        Node next=null;
        Node curr=head;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
