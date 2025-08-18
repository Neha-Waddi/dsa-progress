
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}


public class add2nums_no_extrazero {
    static Node addTwoLists(Node head1, Node head2) {
        // code here
        int carry=0;
        int sum=0;
        
        Node res=new Node(0);
        Node temp=res;
        
        head1=remove(head1);
        head2=remove(head2);
        
        head1=rev(head1);
        head2=rev(head2);
        
        while(head1!=null|| head2!=null){
            sum=carry;
            if(head1!=null){
                sum+=head1.data;
                head1=head1.next;
            }
            if(head2!=null){
                sum+=head2.data;
                head2=head2.next;
            }
            
            temp.next=new Node(sum%10);
            carry=sum/10;
            temp=temp.next;
        }
        if(carry>0){
            temp.next=new Node(carry);
        }
        return rev(res.next);
    }
    static Node rev(Node list){
        Node prev=null;
        Node next=null;
        Node temp=list;
        
        while(temp!=null){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }
    static Node remove(Node head) {
        while (head != null && head.data == 0) {
            head = head.next;
        }
        return (head == null) ? new Node(0) : head; 
    }
}
