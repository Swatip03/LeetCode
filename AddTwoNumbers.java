public class AddTwoNumbers {

     static class ListNode{

        int val;
        ListNode next;


        ListNode(int val){

            this.val = val;
            this.next = null;


        }


    }

    public static void insertAtEnd(int val , ListNode head){

        ListNode newNode = new ListNode(val);

        if (head == null) {

            head = newNode;
            return;
            
        }

        ListNode cuNode = head;

        while (cuNode.next != null) {

            cuNode = cuNode.next;
            
        }

        cuNode.next = newNode;

    }
    
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // Adding to numbers huhhh in this case the error which u are getting involves the addition of numbers on the list and the lis t are already
        // In reverse order and since the addition starts from unit place we have to utilise that concept here

        ListNode temp1 = l1;
        ListNode temp2 = l2;

        ListNode head = new ListNode(-1);
        int carry = 0;

        while (temp1 != null || temp2 != null) {

            int sum = carry;
            if (temp1 != null) {

                sum = sum + temp1.val;
                temp1 = temp1.next;
                
            }

            if (temp2 != null) {

                sum = sum + temp2.val;
                temp2 = temp2.next;

            }

            insertAtEnd(sum % 10, head);
            carry = sum/10;

    
        }

        if (carry != 0) {

            insertAtEnd(carry, head);
            
        }

        head = head.next;

        return head;

   
    }

    public static void printTheList(ListNode head ){

        ListNode cuNode = head;

        while (cuNode != null) {

            System.out.print(cuNode.val + " ---> ");
            cuNode = cuNode.next;
            
        }

        System.out.print("null");

    }

    public static void main(String[] args) {
        
        ListNode a = new ListNode(5);
        // ListNode b = new ListNode(4);
        // ListNode c = new ListNode(3);
        // ListNode d = new ListNode(6);

        ListNode l1 = a;
        // a.next = b;
        // b.next = c;
        // c.next = d;

        
        ListNode e = new ListNode(7);
        // ListNode f = new ListNode(6);
        // ListNode g = new ListNode(4);
        

        ListNode l2 = e;
        // e.next = f;
        // f.next = g;
        

        ListNode head = addTwoNumbers(l1, l2);

        printTheList(head);
        

    }
}
