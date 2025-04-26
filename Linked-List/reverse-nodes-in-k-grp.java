class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {

        int count=0;
        ListNode curr=head;
        while(curr!=null && count<k){
            curr=curr.next;
            count++;
        }
        if(count==k){
            ListNode reversedhead=reverse(head,k);
            head.next=reverseKGroup(curr,k);
            return reversedhead;
        }
        return head;
        
    }
    public ListNode reverse(ListNode head,int k){
        ListNode prev=null;
        ListNode next=null;
        ListNode temp=head;
        while(k-->0 ){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;

    }
    
}