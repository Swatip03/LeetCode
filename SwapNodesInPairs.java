public class SwapNodesInPairs {

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


    
    public ListNode swapPairs(ListNode head) {

        int[] arr = new int[sizeOfList(head)];

        int idx = 0;
        ListNode cuNode = head;

        while ( cuNode != null) {

            arr[idx] = cuNode.val;
            idx++;
            cuNode = cuNode.next;
            
        }

        // Now modifying the value of the array

        for(int i = 0 ; i < arr.length ; i++){

            if (i % 2 != 0) {

                int temp = arr[i-1];
                arr[i-1] = arr[i];
                arr[i] = temp;
                
            }


        }


        // Now making the linked list out of the modified arraay

        for(int i = 0 ; i < arr.length ; i++){

            addLast(arr[i]);


        }


        return hNode;


        
    }
}
