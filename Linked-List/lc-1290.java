//convert Binary Number in a linked list to integer
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}
class Solution {
    public int getDecimalValue(ListNode head) {

        int res=0;
        ListNode start=head;
        while(start!=null){
            
            res=res<<1 | start.val;
            start=start.next;
        }
        return res;
    }
}