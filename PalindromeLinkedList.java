public class PalindromeLinkedList {

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
    
    public boolean isPalindrome(ListNode head) {

        int n = sizeOfList(head);

        // Converthing the given linked list into a array

        int[] arr = new int[n];

        ListNode currNode = head;
        int idx = 0;

        while (currNode != null) {

            arr[idx] = currNode.val;
            idx++;
            currNode = currNode.next;
            
        }

        // Now check if the array is palindrome or not

        for(int i = 0; i < n/2 ; i++){

            if (arr[i] != arr[arr.length-1-i]) {

                return false;
                
            }
        }


        return true;


        
    }


    public static void main(String[] args) {
        
        
        
    }
}
