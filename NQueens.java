import java.util.ArrayList;
import java.util.List;

public class NQueens {

    public boolean isSafe(int row , int col , char[][] board ){

        // To check the row direction 
        int dupRow = row;
        int dupCol = col;

        while (col >= 0) {

            if (board[row][col] == 'Q') {

                return false;
                
            }

            col--;      // only the column will decrease the row will be constant in this case
            
        }

        // Checking for the upper diagonal

        row = dupRow;
        col = dupCol;

        while (row >= 0 && col >= 0) {

            if (board[row][col] == 'Q') {
                return false;
            }
            
            row--;    // In this row will decrease as well as col will decrease
            col--;
        }

        // Checking for the lower diagonal
        row = dupRow;
        col = dupCol;

        while (row < board.length && col >= 0) {

            if (board[row][col] == 'Q') {

                return false;
                
            }

            row++;
            col--;

        }

        return true;
    }

    public void solve(int col , char[][] board , List<List<String>> ans){

        // Base Condition
        if (col == board.length) {

            ans.add(construct(board));
            return;
            
        }

        // Backtracking 
        for(int row = 0 ; row < board.length ; row++){

            if (isSafe(row, col, board)) {

                board[row][col] = 'Q';
                solve(col+1, board, ans);
                board[row][col] = '.';
                
            }
        }


    }

    public List<String> construct(char[][] board){

        List<String> lst = new ArrayList<>();

        for(int i = 0 ; i < board.length ; i++){

            String str = new String(board[i]);
            lst.add(str);

        }

        return lst;

    }
    
    public List<List<String>> solveNQueens(int n) {

           char[][] board = new char[n][n];
           for(int i = 0 ; i < n; i++){

            for(int j = 0 ; j < n ; j++){

                board[i][j] = '.';

            }

        }

        int col = 0;
        List<List<String>> ans = new ArrayList<>();
        solve(col, board, ans);


        return ans;

    }

    public static void main(String[] args) {
        
        NQueens nq = new NQueens();

        int n = 1;

        List<List<String>> ans = nq.solveNQueens(n);

        System.out.println(ans);
    }


}
