import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesFromASortedList {
    
    public ListNode hNode;

    public class ListNode {

            int val;
            ListNode next;
             
            ListNode(int val){

                this.val = val;
                this.next = null;

            }

    }

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

    public ListNode deleteDuplicates(ListNode head) {

        HashSet<Integer> set = new HashSet<>();

        ListNode currNode = head;

        while (currNode != null) {

            set.add(currNode.val);
            currNode = currNode.next;
            
        }

        int[] arr = new int[set.size()];

        int idx = 0;

        for(int ele : set){

            arr[idx] = ele;
            idx++;

        }

        Arrays.sort(arr);

        // Now making a new linked list of the sorted and unique element array

        for(int i = 0 ; i < arr.length ; i++){

            addLast(arr[i]);

        }


        return hNode;


        
    }
}
