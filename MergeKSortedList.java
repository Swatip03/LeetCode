import java.util.PriorityQueue;

class ListNode{

    int val;
    ListNode next;

    ListNode(int val){

        this.val = val;
        this.next = null;

    }
}

public class MergeKSortedList {

    ListNode hNode ;

    public void addLast(int val ){

        ListNode newNode = new ListNode(val);

        if (hNode == null) {

            hNode = newNode;
            return ;
            
        }

        ListNode currNode = hNode;

        while (currNode.next != null) {

            currNode = currNode.next;
            
        }

        currNode.next = newNode;


    }
    
    public ListNode mergeKLists(ListNode[] lists) {

        // The approcah is to take all the element of the 2d linked list and give them in to the priority queue to make a min heap structure

        // Use for each loop as the data structure is the array of head nodes of list

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(ListNode head : lists){

            ListNode currNode = head;

            while (currNode != null) {

                pq.offer(currNode.val);

                currNode = currNode.next;
                
            }

        }

        // Now create a new linked list out of the given priority queue

        while (!pq.isEmpty()) {

            addLast(pq.peek());

            pq.poll();
            
        }

        return hNode;


        
    }
}
