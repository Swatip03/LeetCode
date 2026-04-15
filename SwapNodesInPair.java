public class SwapNodesInPair {
public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    public ListNode swapPairs(ListNode head) {
         if (head == null || head.next == null) return head;
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        ListNode prev = head;
        ListNode curr = head.next;
        while (curr != null) {
            ListNode nextNode = curr.next;

            temp.next = curr;
            prev.next = curr.next;
            curr.next = prev;

            temp = prev;         // ✅ temp moves to prev (end of swapped pair)
            prev = nextNode;     // ✅ prev moves to next pair start
            if (nextNode != null) {
                curr = nextNode.next;
            }else{
                curr = null;
            }
        }

        return dummy.next;
    }
}
