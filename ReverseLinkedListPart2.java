public class ReverseLinkedListPart2 {

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

    
    public int sizeOfList(ListNode hNode){

        ListNode cuNode = hNode;

        int cnt = 0;

        while (cuNode != null) {

            cnt++;
            cuNode = cuNode.next;
            
        }

        return cnt;

    }
    
    public ListNode reverseBetween(ListNode head, int left, int right) {

        int[] arr = new int[sizeOfList(head)];

        ListNode currNode = head;
        int idx = 0;

        // Add all the elements of the linked list into the array

        while (currNode != null) {

            arr[idx] = currNode.val;
            idx++;
            currNode = currNode.next;
            
        }

        // Now reverse this array inplace in between by using two pointers

        int lfx = left-1;
        int rfx = right-1;

        while (lfx < rfx) {

            int temp = arr[lfx];
            arr[lfx] = arr[rfx];
            arr[rfx] = temp;

            lfx++;
            rfx--;
            
        }

        // Now make the linked list of the given array

        for(int i = 0 ; i < arr.length ; i++){

            addLast(arr[i]);


        }

        return hNode;
        
    }
}
