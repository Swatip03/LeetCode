package ArrayProb;

public class MergeSort {
    
    public void mergeSort(int[] nums , int left , int right){
        if (left < right) {
            
            int mid = left + (right-left)/2;

            //Sort the first & Second halves
            mergeSort(nums, left, mid);
            mergeSort(nums, mid+1, right);

            merge(nums, left, mid, right);
        }
    }

    public void merge(int[] nums , int left , int mid , int right){
        //finding the length of both the arrays
          int n1 = mid-left+1;
          int n2 = right-mid;   //as it starts from mid+1

          int[] L = new int[n1];
          int[] R = new int[n2];

          //Copy data into temprory arrays
          for(int i = 0 ; i < n1 ; i++) L[i] = nums[left+i];
          for(int j = 0 ; j < n2 ; j++) R[j] = nums[mid+1+j];

          //Merge temprory array back into the original array
          int i = 0 , j = 0 ;
          int k = left;

          while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                nums[k] = L[i];
                i++;
            }else{
                nums[k] = R[j];
                j++;
            }
            k++;
          }

          //Copy the remaining array into the original array
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
    }
}
