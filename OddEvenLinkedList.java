import java.util.ArrayList;

public class OddEvenLinkedList {

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

    public ListNode oddEvenList(ListNode head) {

        int n = sizeOfList(head);

        int[] arr = new int[n];
        int[] oeArr = new int[n];

        ListNode currNode = head;
        int idx = 0;

        while (currNode != null) {

            arr[idx] = currNode.val;
            idx++;
            currNode = currNode.next;
            
        }

        // Now making the new list of odd index and even index seperately of the given arrangement

        ArrayList<Integer> lstOdd = new ArrayList<>();
        ArrayList<Integer> lstEve = new ArrayList<>();

        
        for(int i = 0; i < arr.length ; i++){

            if (i % 2 == 0) {

                lstOdd.add(arr[i]);         // Odd index list


            }
            else{

                lstEve.add(arr[i]);

            }

        }

        // Now making the right array
        int oddIdx = 0;
        int eveIdx = 0;
        for(int i = 0 ; i < oeArr.length ; i++){

            if (i < lstOdd.size()) {

                oeArr[i] = lstOdd.get(oddIdx);
                oddIdx++;
                
            }
            else{

                oeArr[i] = lstEve.get(eveIdx);
                eveIdx++;

            }
        }

        // Making a new linked list of the modiefied oeArr

        for(int i = 0; i < oeArr.length ; i++){

            addLast(oeArr[i]);

        }


        return hNode;
        
    }
}