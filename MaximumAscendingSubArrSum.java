public class MaximumAscendingSubArrSum {
    
    public int maxAscendingSum(int[] nums) {

        int sum = nums[0];
        int maxSum = nums[0];

        for(int i = 0 ; i < nums.length-1 ; i++){

            if (nums[i] < nums[i+1]) {

                sum = sum + nums[i+1];

                if (sum > maxSum) {

                    maxSum = sum;
                    
                }
                
            }


            else if (nums[i] >= nums[i+1]) {

                sum = nums[i+1];
                
            }

        }


        return maxSum;
        
    }


    public static void main(String[] args) {
        
        MaximumAscendingSubArrSum ma = new MaximumAscendingSubArrSum();

        int[] nums = {5,5,6,6,6,9,1,2};

        int ans = ma.maxAscendingSum(nums);

        System.out.println(ans);
    }
}
