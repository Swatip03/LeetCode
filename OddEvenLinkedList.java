public class OddEvenLinkedList {
    
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
           this.val = val;
           this.next = null;
        }
    }
    public ListNode oddEvenList(ListNode head) {

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {

            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;

    }
}
