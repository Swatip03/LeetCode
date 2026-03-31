public class FindFirstAndLastPositionInAnArray {
    
    public int[] searchRange(int[] nums, int target) {

        int[] range = new int[2];

        int start = 0 ;
        int end = nums.length - 1;

        boolean notPresent = true;

        for(int i = 0 ; i < nums.length ; i++){

            if (nums[i] == target) {

                notPresent = false;

                break;
                
            }

        }

            

        if (nums.length == 0 || notPresent || nums[start] > target || nums[end] < target ) {

            range[0] = -1;
            range[1] = -1;
  
            return range;
            
        }

        while (start <= end) {

            int mid = (start+end)/2;

            if (nums[mid] <= target) {

                start = mid + 1;
                
            }

            if (nums[mid] > target) {

                end = mid - 1;
                
            }
            
        }

        range[1] = start - 1;

        // Next loop


        start = 0;
        end = nums.length - 1;

        while (start <= end) {

            int mid = (start+end)/2;

            if (nums[mid] < target) {

                start = mid + 1;
                
            }

            if (nums[mid] >= target) {

                end = mid - 1;
                
            }
            
        }

        range[0] = end + 1;


        return range;
        
    }

    public static void main(String[] args) {
        
        FindFirstAndLastPositionInAnArray ff = new FindFirstAndLastPositionInAnArray();

        int[] nums = {5,7,7,8,8,8,9};

        int target = 8;

        int[] range = ff.searchRange(nums, target);

        System.out.println("The answer is "+range[0]+"  "+range[1]);
    }
}
