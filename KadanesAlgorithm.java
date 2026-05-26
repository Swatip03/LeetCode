package ArrayProb;
public class KadanesAlgorithm{
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        
        int cuSum = 0;
        for(int i = 0 ; i < n ; i++){
            cuSum += nums[i];
            maxSum = Math.max(cuSum, maxSum);
            if (cuSum < 0) {  // if the current sum is -ve then start afresh
                cuSum = 0;
            }
        }

        return maxSum;
    }
}