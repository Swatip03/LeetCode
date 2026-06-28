package DynamicProgramming;

import java.util.Arrays;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int idx = 0;
        int[] memo = new int[nums.length];
        Arrays.fill(memo, -1);
        return solve(nums, memo , idx);
    }

    public boolean solve(int[] nums,int[] memo , int idx) {
        if (idx >= nums.length - 1) { // Reached to last or pass thru last idx
            return true;
        }

        if (nums[idx] == 0) { // U are stuck
            return false;
        }

        if (memo[idx] != -1) {
            return memo[idx] == 1;
        }

        for (int jump = 1; jump <= nums[idx]; jump++) { // 0 <= j <= nums[i]
            if (solve(nums,memo, idx + jump)) {
                memo[idx] = 1;
                return true;
            }
        }

        memo[idx] = 0;
        return false;
    }
}
