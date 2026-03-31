import java.util.HashMap;

class ListNode {
        int val;
        ListNode next;
    ListNode(int x) {
            val = x;
            next = null;
        }
     }

public class IntersectionPointOfTwoLinkedList {
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        HashMap<ListNode,Integer> hMap = new HashMap<>();
        
        ListNode cuNode1 = headA;

        while (cuNode1 != null) {

            hMap.put(cuNode1, 1);
            cuNode1 = cuNode1.next;
            
        }

        // Now for the intersection part 
        ListNode cuNode2 = headB;

        while (cuNode2 != null) {

            if (hMap.containsKey(cuNode2)) {

                return cuNode2;
                
            }

            cuNode2 = cuNode2.next;
            
        }

        return null;
        
    }
}
