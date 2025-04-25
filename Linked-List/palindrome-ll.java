
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode mid=middle(head);
        ListNode second=reverse(mid);
        ListNode start=head;

        while(second!=null){
            if(start.val != second.val){
                return false;
            }
            start=start.next;
            second=second.next;
        }
        return true;

    }
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode temp=head;
        ListNode next=null;
        while(temp!=null){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }
    public ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast !=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}