class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        int sum=0;
        ListNode res=new ListNode(0);
        ListNode p=res;
        while(l1!=null || l2!=null){
            sum=carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            p.next=new ListNode(sum%10);
            carry=sum/10;
            p=p.next;


        }
        if(carry>0){
            p.next=new ListNode(carry);
        }
        return res.next;
    }
}