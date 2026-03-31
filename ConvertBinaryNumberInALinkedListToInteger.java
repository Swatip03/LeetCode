public class ConvertBinaryNumberInALinkedListToInteger {

    public ListNode hNode;

    public class ListNode {

            int val;
            ListNode next;
             
            ListNode(int val){

                this.val = val;
                this.next = null;

            }

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
    
    public int getDecimalValue(ListNode head) {

        int[] arr = new int[sizeOfList(head)];

        ListNode currNode = head;
        int idx = 0;

        while (currNode != null) {

            arr[idx] = currNode.val;
            idx++;
            currNode = currNode.next;

            
        }

        int pow = 1;
        int num = 0;

        for(int i = arr.length-1 ; i >= 0 ; i--) {

            num = num + arr[i]*pow;
            pow = pow*2;

        }


        return num;
        
    }
}
