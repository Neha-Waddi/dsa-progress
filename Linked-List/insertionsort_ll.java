 class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
 
class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy=new ListNode(0,head);
        ListNode curr=head.next;
        ListNode prev=head;

        while(curr!=null){
            if(curr.val>prev.val){
                prev=curr;
                curr=curr.next;
                continue;
                
            }

            ListNode temp=dummy;
            while(temp.next.val<curr.val){
                temp=temp.next;
            }
            prev.next=curr.next;
            curr.next=temp.next;
            temp.next=curr;
            curr=prev.next;
        }
        return dummy.next;
    }
}