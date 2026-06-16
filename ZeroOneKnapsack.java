package DynamicProgramming;

import java.util.Arrays;

public class ZeroOneKnapsack {
    public int knapsack(int W, int val[], int wt[]) {
        int n = wt.length;
        // code here
        int idx = 0;
        int[][] memo = new int[W+1][n];
        for(int[] row : memo){
            Arrays.fill(row, -1);
        }
        return solve(W, val, wt, idx,memo);
    }

    public int solve(int W , int val[] , int wt[], int idx,int[][] memo){
           //Base Case!!!!!
           if (idx >= wt.length) {
              return 0;
           }

           if (memo[W][idx] != -1) {
              return memo[W][idx];
           }
           int take = 0;
           if (wt[idx] <= W) {
            take = val[idx] + solve(W-wt[idx], val, wt, idx+1,memo);
           }
           int notTake = solve(W, val, wt, idx+1,memo);

           memo[W][idx] = Math.max(take, notTake);
           return memo[W][idx];
    }
}
