public class CreateBST_ll {
    public TreeNode sortedListToBST(ListNode head) {
        return bst(head);
    }

    public TreeNode bst(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return new TreeNode(head.val);

        ListNode mid=middle(head);
        TreeNode root = new TreeNode(mid.val);

        if (mid != head)
            root.left = bst(head);
            
        root.right = bst(mid.next);

        return root;
    }
    public ListNode middle(ListNode head){
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (prev != null) prev.next = null;
        return slow;

    }
}
