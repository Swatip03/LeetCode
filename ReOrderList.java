public class ReOrderList {

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
    
    public void reorderList(ListNode head) {

        int[] arr = new int[sizeOfList(head)];

        ListNode currNode = head;
        int idx = 0;

        // Make array from the linked list

        while (currNode != null) {

            arr[idx] = currNode.val;
            idx++;
            currNode = currNode.next;
            
        }

        // Reorder the list according to the condition

        int[] ans = new int[arr.length];

        int s = 0;
        int e = arr.length-1;

        int sdx = 0;

        while ( s <= e) {

            if (sdx % 2 == 0) {

                ans[sdx] = arr[s];
                s++;
                
            }
            else{

                ans[sdx] = arr[e];
                e--;

            }

            sdx++;
            
        }

        // Now make the linked list of the ans array

        for(int i = 0; i < ans.length ; i++){

            addLast(ans[i]);

        }

        head = hNode;


        
    }
}
