package DynamicProgramming;

import java.util.Arrays;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        
        int r = 0; //the row indexes
        int c = 0; //the col indexes
        int[][] memo = new int[m][n];
        for(int[] row : memo){
            Arrays.fill(row, -1);
        }
        return solve(m, n, r, c,memo);
    }

    // the solve denotes  how many paths exist from (r,c) to the destination????"
    public int solve(int m , int n , int r, int c ,int[][] memo){

          if (r == m-1 && c == n-1) { //  reached destination — this counts as 1 complete valid path
            return 1;
          }

          if (r >= m || c >= n) { //went out of bound horizontally or vertaically --no valid path exists
            return 0;
          }

          if (memo[r][c] != -1) {
             return memo[r][c];
          }

          int right =  solve(m, n, r, c+1 ,memo);
          int down =  solve(m, n, r+1, c , memo);

          memo[r][c] = right+down;
          return memo[r][c];
    }
}
