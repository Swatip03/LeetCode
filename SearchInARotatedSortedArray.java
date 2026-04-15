public class SearchInARotatedSortedArray {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;

        while (low <= high) {    
            int mid = low + (high-low)/2;
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[low] <= nums[mid]) {  // the condition of left half is sorted
                if (nums[low] <= target && target < nums[mid]) {      // the target element is in the left sorted part
                    high = mid-1;   // move left
                }else{
                    low = mid+1;   //  move right  (ie try to go to the other half of the array)
                }
            }

            if (nums[mid] <= nums[high]) {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid+1;     // move right
                }else{
                    high = mid-1;    // move left (ie try to go to the other half of the array)
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        SearchInARotatedSortedArray sir = new SearchInARotatedSortedArray();
        int[] nums = {7,8,9,1,2,3,4,5,6};
        int target = 3;

        int ans = sir.search(nums, target);
        System.out.println(ans);
    }
}
