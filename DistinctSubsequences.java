package DynamicProgramming;

import java.util.Arrays;

public class DistinctSubsequences {
    public int numDistinct(String s, String t) {
        int i = 0;
        int j = 0;
        int[][] memo = new int[s.length()][t.length()];
        for(int[] row : memo){
            Arrays.fill(row, -1);
        }
        return solve(s, t, i, j,memo);
    }

    public int solve(String s , String t , int i , int j,int[][] memo){
           if (i >= s.length()) {  //ran out of the s string (long one) while t string remain
              return 0;            
           }

           if (j >= t.length()) {   //All of the characters of t string is matched
              return 1; 
           }

           if (memo[i][j] != -1) {
              return memo[i][j];
           }

           if (s.charAt(i) == t.charAt(j)) {    //When the char matches there are two option
              int pick = solve(s, t, i+1, j+1,memo);   //pick the character
              int notPick = solve(s, t, i+1, j,memo);  //not picking the character ( hoping to match t[j] later with a different occurrence )
              memo[i][j] = pick+notPick;
              return memo[i][j];
           }else{
              memo[i][j] = solve(s, t, i+1, j,memo);
              return memo[i][j];      //not picking 
           }
               
      }
}
