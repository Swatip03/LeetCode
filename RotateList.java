class ListNode{

    int val;
    ListNode next;

    ListNode(int val){

        this.val = val;
        this.next = null;

    }
}


public ListNode deleteLast(ListNode head)

    if (head.next == null) {

        ListNode ans = head;
        head = null;

        return ans;
        
    }


    ListNode cuLast = head;
    ListNode cuSeclast = head;

    while (cuLast.next != null) {

        cuSeclast = cuLast;
        cuLast = cuLast.next;

    }

    ListNode ans = cuLast;
    cuSeclast.next = null;

    return ans;


}

public void addFirst(ListNode node, ListNode head){

    if (head == null) {

        head = node;
        return;
        
    }

    node.next = head;
    head = node;

}



public class RotateList {
    
    public ListNode rotateRight(ListNode head, int k) {

        // See the method is simple u have to remove the last element from the list and add this element to the start of the array

        int cnt = 0;

        while (cnt < k) {

            ListNode curr = deleteLast(head);
            addFirst(curr, head);
            
        }

        return head;


        
    }
}
