package BinarySearchProb;

public class SplitArrayLargestSum {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0 ; i < n ; i++){
            max = Math.max(max, nums[i]);
            sum += nums[i];
        }

        int low = max;
        int high = sum;
        int ans = low;

        while (low <= high) {
            int mid = low + (high-low)/2;   //the largest allocated sum
            if (isValid(nums,mid, k)) {   //since we have to find the minimized largest sum
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        return ans;
    }

    public boolean isValid(int[] nums , int maxSum , int k){
        int n = nums.length;
        int cnt = 1;
        int currSum = 0;

        for(int i = 0 ; i < n  ; i++){
            if (currSum + nums[i] <= maxSum) {
                currSum += nums[i];
            }else{
                cnt++;
                currSum = nums[i];
            }
        }

        if (cnt <= k) {    
            return true;
        }else{
            return false;
        }
    }
}
