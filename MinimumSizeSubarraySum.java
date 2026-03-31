public class MinimumSizeSubarraySum {
    
    public int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int right = 0;
        int sum = 0;
        int minLen = 0;

        while (right < nums.length) {

            sum = sum + nums[right];

            while (sum < target) {

                sum = sum - nums[left];
                left = left+1;
                
            }

            if (sum >= target) {

                minLen = Math.min(minLen, right-left+1);
                
            }

            right = right+1;
            
        }


        return minLen;
        
    }


    public static void main(String[] args) {
        
        MinimumSizeSubarraySum ms = new MinimumSizeSubarraySum();

        int[] nums = {2,3,1,2,4,3};
        int target = 7;

        int ans = ms.minSubArrayLen(target, nums);

        System.out.println(ans);

    }
}
