package DynamicProgramming;

import java.util.Arrays;

public class FrogJumpWithKDistances {
    public int frogJump(int[] heights, int k) {
        int n = heights.length;
        int idx = 0;
        int[] memo = new int[n];
        Arrays.fill(memo, -1);
        return solve(heights, idx, k,memo);
    }

    public int solve(int[] height , int idx , int k,int[] memo){
        if (idx >= height.length) {
            return 0;
        }

        if (idx == height.length-1) {
            return 0;
        }

        if (memo[idx] != -1) {
            return memo[idx];
        }

        int minCost = Integer.MAX_VALUE;//initialize a minCost before the loop:
        //now u have to  choose between k options (jump 1, 2, 3... up to k) and also take the minimum of it
        for(int j = 1 ; j <= k ; j++){
            if (idx+j < height.length) {
                int cost = Math.abs(height[idx+j]-height[idx])+solve(height, idx+j, k,memo); //Calculate the cost for the jump j
                minCost = Math.min(minCost, cost);
            }
        }

        memo[idx] = minCost;
        return memo[idx];
    }
}
