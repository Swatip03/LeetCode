public class SearchInRotatedArrayPart2 {

    public boolean search(int[] nums, int target) {

        
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

                return true;
                
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

                return  true;
                
            }

            if (nums[mid] > target) {

                end = mid - 1;
                
            }

            if (nums[mid] < target) {

                start = mid + 1;
                
            }
            
         }
        

        
     return false;
        
    }

    public static void main(String[] args) {
        
        SearchInRotatedArrayPart2 ss = new SearchInRotatedArrayPart2();

        int[] nums = {2,5,6,0,0,1,2};
        int target = 0;

        boolean ans = ss.search(nums, target);

        System.out.println(ans);
    }
    
}
