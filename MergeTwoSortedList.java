

public class MergeTwoSortedList {

    public ListNode head;

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

        if (head == null) {

            head = newNode;
            return ;
            
        }

        ListNode currNode = head;

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
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        int[] arr1 = new int[sizeOfList(list1)];
        int[] arr2 = new int[sizeOfList(list2)];

        ListNode cNode1 = list1;
        ListNode cNode2 = list2;

        int fdx = 0;
        while (cNode1 != null) {

            arr1[fdx] = cNode1.val;
            fdx++;
            cNode1 = cNode1.next;
            
        }


        int sdx = 0;
        while (cNode2 != null) {

            arr2[sdx] = cNode2.val;
            sdx++;
            cNode2 = cNode2.next;
            
        }

        // Merging both the arrays 

        int[] arr = new int[arr1.length + arr2.length];
        int idx = 0;

        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {


                arr[idx] = arr1[i];
                i++;
                
            }
            else{

                arr[idx] = arr2[j];
                j++;

            }

            idx++;
            
        }

        while (i < arr1.length) {

            arr[idx] = arr1[i];
            idx++;
            i++;
            
        }

        while (j < arr2.length) {

            arr[idx] = arr2[j];
            idx++;
            j++;
            
        }


        //Making the linked list out of the array

        ListNode head = null;

        for(int x = 0; x < arr.length ; x++){

            addLast(arr[x]);

        }


        return head;

        
    }


    public static void main(String[] args) {
        
        

    }
}
