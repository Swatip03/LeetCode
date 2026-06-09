package DynamicProgramming;

import java.util.Arrays;

public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int r = 0;
        int c = 0;
        int m = grid.length;
        int n = grid[0].length;

        int[][] memo = new int[m][n];
        for(int[] row : memo){
            Arrays.fill(row, -1);
        }

        return solve(grid, r, c, m, n,memo);
    }

    public int solve(int[][] grid , int r , int c , int m , int n , int[][] memo){
        if (r >= m || c >= n) {
            return 0;
        }

        if (r == m-1 && c == n-1){
            return grid[r][c];
        }

        if (memo[r][c] != -1) {
            return memo[r][c];
        }

        int right = grid[r][c] + solve(grid, r, c+1, m, n,memo);
        int down = grid[r][c] + solve(grid, r+1 , c, m, n,memo);

        memo[r][c] = Math.min(right, down);
        return memo[r][c];
    }
}
