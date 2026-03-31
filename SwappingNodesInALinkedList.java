public class SwappingNodesInALinkedList {

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

    public int sizeOfList(ListNode head){

        ListNode cuNode = head;

        int cnt = 0;

        while (cuNode != null) {

            cnt++;
            cuNode = cuNode.next;
            
        }

        return cnt;

    }
    
    public ListNode swapNodes(ListNode head, int k) {

        int[] arr = new int[sizeOfList(head)];

        ListNode cuNode = head;
        int idx = 0;


        // Making array out of the list

        while (cuNode != null) {

            arr[idx] = cuNode.val;
            idx++;
            cuNode = cuNode.next;
            
        }

        // Swap elements in the array according to the condition

        int ksdx = k-1;
        int kedx = arr.length - 1 - (k-1);

        // Swap this two elements
        int temp = arr[ksdx];
        arr[ksdx] = arr[kedx];
        arr[kedx] = temp;

        // Make the linked list out of this array now

        for(int i = 0 ; i < arr.length ; i++){

            addLast(arr[i]);

        }

        return hNode;
 
    }
}
