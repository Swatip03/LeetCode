public class SearchInRotatedArray {
    
    public int search(int[] nums, int target) {

        // Finding the inversion point

        int pivotIndex = 0;

        for(int i = 0 ; i < nums.length -1 ; i++){

            if (nums[i] > nums[i+1]) {

                pivotIndex = i;
                break;
                
            }

        }

        int start = 0; 
        int end = pivotIndex;


        while (start <= end) {

            int mid = start + (end - start)/2;

            if (nums[mid] == target) {

                return mid;
                
            }

            if (nums[mid] > target) {

                end = mid - 1;
                
            }

            if (nums[mid] < target) {

                start = mid + 1;
                
            }
            
        }

        // Now Searching in the other part of array

         start = pivotIndex + 1;
         end =  nums.length - 1;


         while (start <= end) {

            int mid = start + (end-start)/2;

            if (nums[mid] == target) {

                return  mid;
                
            }

            if (nums[mid] > target) {

                end = mid - 1;
                
            }

            if (nums[mid] < target) {

                start = mid + 1;
                
            }
            
         }
        

        
     return -1;

    }


    public static void main(String[] args) {
        
        SearchInRotatedArray ss = new SearchInRotatedArray();

        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;

        int index = ss.search(nums, target);

        System.out.println(index);
    }
}
