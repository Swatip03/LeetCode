package DynamicProgramming;

import java.util.Arrays;
import java.util.List;

public class Triangle {
     public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();

        //Ok for a memo 2d array for this problem
        int[][] memo = new int[n][];
        //lets fill the row of the memo array
        for(int i = 0 ; i < n-1 ; i++){
            int[] row = new int[i+1];
            memo[i] = row;
        }

        memo[n-1] = new int[n];

        //Now lets fill the array
        for(int[] row : memo){
            Arrays.fill(row, Integer.MAX_VALUE);      //We cant fill with -1 bcz what if the ele is -ve
        }
        int idx = 0;
        int col = 0;

        return solve(triangle, idx, col,memo);
    }

    public int solve(List<List<Integer>> triangle , int idx , int col,int[][] memo){
        if (idx >= triangle.size()) {
            return 0;
        }

        if (memo[idx][col] != Integer.MAX_VALUE) {
            return memo[idx][col];
        }

        int take1 = triangle.get(idx).get(col) + solve(triangle, idx+1, col,memo);
        int take2 = triangle.get(idx).get(col) + solve(triangle, idx+1, col+1,memo);

        memo[idx][col] = Math.min(take1, take2);
        return memo[idx][col];
    }
}
