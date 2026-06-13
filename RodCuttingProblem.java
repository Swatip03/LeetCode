package DynamicProgramming;

import java.util.Arrays;

public class RodCuttingProblem {
    public int cutRod(int[] price) {    //The price array is 1 indexed array!!
        // code here
        
        int len = price.length;
        int idx = 1;
        if (len == 0) {
            return 0;
        }
        int[][] memo = new int[price.length+1][len+1];
        for(int[] row : memo){
            Arrays.fill(row, -1);
        }
        return solve(price, idx, len , memo);
    }

    public int solve(int[] price , int idx , int len , int[][] memo){
        if (idx > price.length) {
            return 0;
        }

        if (memo[idx][len] != -1) {
            return memo[idx][len];
        }

        int take = 0;
        if (idx <= len) {
            take = price[idx] + solve(price, idx, len-idx,memo); //not incrementing idx as unbounded knapsack
        }

        int notake = solve(price, idx+1, len,memo);

        memo[idx][len] = Math.max(take, notake);
        return memo[idx][len];
    }
}
