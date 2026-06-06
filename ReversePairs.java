package ArrayProb;

public class ReversePairs {
    public int reversePairs(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        return mergeSortAndCount(nums, left, right);
    }

    public int mergeSortAndCount(int[] nums , int left , int right){
        int count = 0;
        if (left < right) {
            int mid = left + (right-left)/2;
            count += mergeSortAndCount(nums, left, mid);
            count += mergeSortAndCount(nums, mid+1, right);

            count += mergeAndCount(nums, left, mid, right);
        }

        return count;
    }

    public int mergeAndCount(int[] nums , int left , int mid , int right){
          //mergeing the array with two temprory array
          //finding the length of both the left and right halves
          int n1 = mid-left+1;
          int n2 = right-mid;

          int[] L = new int[n1]; //The left half of the array!!
          int[] R = new int[n2]; //The right half of the array!!

          //filling both the arrays!!!!!!!!!
          for(int i = 0 ; i < n1 ; i++) L[i] = nums[left+i];
          for(int j = 0 ; j < n2 ; j++) R[j] = nums[mid+1+j];

          int cnt = 0;     //Counting the reverse pairs!!!!!!!!!!
          int r = 0;
          //Lets do the job of counting the reverse pairs!!!
          for(int i = 0 ; i < n1 ; i++){      //Iterating thru the L array
              while (r < n2 && L[i] > 2L * R[r]) {     //The moving thru the right array with the exact condition
                cnt++;
                r++;
            }
          }


          //Now merging 
          int i = 0 , j = 0;
          int k = left;

          while (i < n1 && j < n2) {
            if (L[i] < R[j]) {
                nums[k] = L[i];
                i++;
            }else{    //here u cant count the reverse pairs bcz here  L[i] > R[j] but i < j always and hence we miss the j < i pairs!
                nums[k] = R[j];
                j++;
            }

            k++;
          }

          //Now filling the remaining arrays!!!
          while (i < n1) {
            nums[k] = L[i];
            i++;
            k++;
          }

          while (j < n2) {
            nums[k] = R[j];
            j++;
            k++;
          }

        return cnt;
    }
}
