public class SearchInsertPosition {
    
    public int searchInsert(int[] nums, int target) {

        int start = 0 ; 
        int end = nums.length - 1;

        if(target < nums[start]){

            return start;

        }

        if(target > nums[end]){

            return end + 1;

        }

        while(start <= end){

            int mid = start + (end - start)/2;

            if(nums[mid] == target){

                return mid;

            }

            if(nums[mid] > target && nums[mid-1] < target){

                return mid;

            }

            if(nums[mid] > target){

                end = mid - 1;

            }

            if(nums[mid] < target){

                start = mid + 1;

            }

        }


        return -1;
        
    }


    public static void main(String[] args) {
        
        SearchInsertPosition ss = new SearchInsertPosition();

        int[] nums = {1,3,5,6};
        int target = 7;

        int ans = ss.searchInsert(nums, target);

        System.out.println(ans);
        
    }
}
