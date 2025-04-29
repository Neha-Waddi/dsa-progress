class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}
class Solution {
    public ListNode deleteMiddle(ListNode head) {
         if (head == null || head.next == null) {
            return null; 
        }
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=head;


        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
       
        prev.next=slow.next;
        return head;

    }
}