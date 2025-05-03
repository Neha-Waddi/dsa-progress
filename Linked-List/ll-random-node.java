
   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    int len=0;
    ListNode list;
    public Solution(ListNode head) {
        this.list=head;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
    }
    
    public int getRandom() {
        int random=(int)(Math.random()%len);
        ListNode temp=list;
        for(int i=1;i<=random;i++){
            temp=temp.next;
        }
        return temp.val;
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */