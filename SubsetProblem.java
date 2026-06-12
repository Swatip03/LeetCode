package DynamicProgramming;

import java.util.Arrays;

public class SubsetProblem {
        static Boolean isSubsetSum(int[] nums, int sum) {
        int n = nums.length;

        // code here
        int idx = 0;
        int[][] memo = new int[n][sum+1];
        for(int[] row : memo){
            Arrays.fill(row, -1);
        }

        return solve(nums, sum, idx,memo);
    }

    public static boolean solve(int[] nums , int sum , int idx,int[][] memo){
        if (idx >= nums.length) {
            if (sum == 0) {
                return true;
            }else{
                return false;
            }
        }

        if (sum == 0) {
            return true;
        }

        if (memo[idx][sum] != -1) {
            if (memo[idx][sum] == 1) {
                return true;
            }else{
                return false;
            }
        }
        
        boolean take = false;
        if (nums[idx] <= sum) {
             take = solve(nums, sum-nums[idx], idx+1,memo);
        }
        boolean noTake = solve(nums, sum, idx+1,memo);

        if (take || noTake) {
            memo[idx][sum] = 1;
            return true;
        }else{
            memo[idx][sum] = 0;
            return false;
        }
    }
}
