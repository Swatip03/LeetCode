import java.util.HashMap;


class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    
  }
}

public class LinkedListCycleII {

    
    public ListNode detectCycle(ListNode head) {


        
    ListNode cuNode = head;
    HashMap<ListNode,Integer> hmap = new HashMap<>();

    while (cuNode != null) {

        if (!hmap.containsKey(cuNode)) {

            return cuNode;
            
        }
        else{

            hmap.put(cuNode, 1);

        }

        cuNode = cuNode.next;
        
    }

    return null;
        
 }
 
}
