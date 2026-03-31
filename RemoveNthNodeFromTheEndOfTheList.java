public class RemoveNthNodeFromTheEndOfTheList {
    

    static class ListNode{

        int data;
        ListNode next;

        ListNode(int data){

            this.data = data;
            this.next = null;

        }

    }

    public void display(ListNode head){

        ListNode cuNode = head;

        while (cuNode != null) {

            System.out.print(cuNode.data + " --> ");
            cuNode = cuNode.next;
            
        }

        System.out.print("null");

    }

    


    public ListNode removeNthFromEnd(ListNode head, int n) {

        // Find the length of the list

        int len = 0;

        ListNode curNode = head;

        while (curNode != null) {

            curNode = curNode.next;
            len++;
            
        }

        if (len == 1) {

            head = head.next;
            return head;
            
        }

        if (len == n) {

            head = head.next;
            return head;
            
        }

        // Now find the index from where we have to remove the element

        int index = len - n;

        // Remove the element at index 

        ListNode prevNode = head;
        ListNode cuNode = head;

        int cnt = 0;

        while (cnt < index) {

            prevNode = cuNode;
            cuNode = cuNode.next;
            cnt++;
            
        }

        prevNode.next = cuNode.next;
        cuNode.next = null;


        return head;
        
    }


    public static void main(String[] args) {
        
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);

        
      // Esatblishing the connections

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        

        RemoveNthNodeFromTheEndOfTheList rr = new RemoveNthNodeFromTheEndOfTheList();

        rr.display(a);

        System.out.println();

        rr.removeNthFromEnd(a, 2);

        rr.display(a);




    }
}
