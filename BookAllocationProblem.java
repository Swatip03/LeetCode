package BinarySearchProb;

public class BookAllocationProblem {
    public int findPages(int[] arr, int k) {
         int n = arr.length;
         if (k > n) {
            return -1;
         }
         int max = Integer.MIN_VALUE;   //answer can never be less than the largest single book
         int sum = 0;

         for(int i = 0 ; i < n  ; i++){
            max = Math.max(max, arr[i]);
            sum += arr[i];
         }

         int low = max;
         int high = sum;
         int ans = low;

         while (low <= high) {
            int mid = low + (high-low)/2;    //for alloting maximum possible page allotment
            
            if (isValid(arr, mid, k)) {    //if true then search for the minimum possible page allotment ie search in left
                ans = mid;
                high  = mid-1;
            }else{
                low = mid+1;
            }

         }

        return ans;
        
    }

    public boolean isValid(int[] arr , int maxPage , int k){
        /*"if each student can hold at most maxPage pages,
         can I distribute all the books among students without exceeding k students?" */

        int n = arr.length;
        int cntS = 1; //for counting the number of student
        int currPage = 0; //for keeping track of the pages held by the student

        for(int i = 0 ; i < n  ; i++){
            if (currPage + arr[i] <= maxPage) {
                currPage += arr[i];
            }else{
                cntS++;
                currPage = arr[i];
            }
        }

        if (cntS <= k) {    //using fewer students than available is still valid
            return true;
        }else{
            return false;
        }
    }
}
