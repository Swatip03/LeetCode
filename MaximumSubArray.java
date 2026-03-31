public class MaximumSubArray {
    
    public int maxSubArray(int[] nums) {

        // THE KADANE'S ALGORITHM

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i = 0 ; i < nums.length ; i++){

            currSum = currSum + nums[i];

            if (currSum > maxSum) {

                maxSum = currSum;       // If the currSum is greater than then store in the maxSum
                
            }

            if (currSum < 0) {

                currSum = 0;           // Making the currSum to 0 as the negative integer will only reduce the sum
                
            }
        }









        // ---------------------------------- This method will not be applied in the case of array with negative terms----------------------

        // int maxSum = Integer.MIN_VALUE;

        // int sum = 0;

        // for(int i = 0 ; i < nums.length ; i++){

        //     sum = sum + nums[i];

        //     if (sum > maxSum) {

        //         maxSum = sum;
                
        //     }
        // }

        // int left = 1;
        // int right = 1;

        // sum = 0;

        // while (right < nums.length) {

        //     sum = sum + nums[right];

        //     if (maxSum < sum) {

        //         maxSum = sum;
                
        //     }

        //     if (sum <= maxSum) {

        //         sum = sum - nums[left];
        //         left++;
                
        //     }

        //     right++;

            
        // }


        return maxSum;
        
    }

    public static void main(String[] args) {
        
        MaximumSubArray mm = new MaximumSubArray();

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        int maxSum = mm.maxSubArray(nums);

        System.out.println(maxSum);


    }
}
