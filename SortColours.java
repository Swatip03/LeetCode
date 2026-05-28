package ArrayProb;

public class SortColours {
    public void sortColors(int[] nums) {
        int n = nums.length;
        
        int low = 0;
        int mid = 0;
        int high = n-1;

        while (mid <= high) {
            if (nums[mid] == 0) {

                //Swap the index of low and mid
                int temp = nums[low];
                nums[low]= nums[mid];
                nums[mid] = temp;
                
                low++;
                mid++;
            }else if (nums[mid] == 1) {
                mid++;
            }else if (nums[mid] == 2) {

                //Swap the index of mid and high
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }


}
