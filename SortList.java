
import java.util.PriorityQueue;

public class SortList {

    public ListNode hNode;

    public class ListNode {

            int val;
            ListNode next;
             
            ListNode(int val){

                this.val = val;
                this.next = null;

            }

    }

    
    public ListNode sortList(ListNode head) {

        // See i am gonna use priority queue in this question and then i will not make a new list 
        // I will just update all the values of the linked list to the values of priority queue and return the head

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        ListNode cuNode = head;

        while (cuNode != null) {

            pq.offer(cuNode.val);
            cuNode = cuNode.next;

        }

        // Now i will update alll the values of the currnodes

        ListNode currNode = head;

        while (currNode != null) {

            currNode.val = pq.peek();
            pq.poll();

            currNode = currNode.next;
            
            
        }

        return head;

        
    }
}
