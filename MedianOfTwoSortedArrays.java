import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        int[] nums = new int[m+n];

        // Fill the nums array

        for(int i = 0; i < nums.length ; i++){

            if (i < m) {

                nums[i] = nums1[i];
                
            }
            else{

                nums[i] = nums2[i-m];

            }

        }

        // Sort the array

        Arrays.sort(nums);

        // Find the median

        double median = 0;

        int l = nums.length;

        if (l % 2 != 0) {

           median = nums[l/2];
            
        }
        else{

            median = (nums[l/2] + nums[(l/2) - 1]) / 2.0;

        }


        return median;
        
    }


    public static void main(String[] args) {

        MedianOfTwoSortedArrays mm = new MedianOfTwoSortedArrays();
        
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};

        double median = mm.findMedianSortedArrays(nums1, nums2);


        System.out.println(median);


    }
}
