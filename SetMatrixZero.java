package Arrays;
import java.util.*;
public class SetMatrixZero {
    public void setZeroes(int[][] matrix) {
       int m = matrix.length;
       int n = matrix[0].length;

       boolean[] row = new boolean[m];
       boolean[] col = new boolean[n];

       // First Pass
       for(int i = 0 ; i < m ; i++){
        for(int j = 0 ; j < n ; j++){
            if (matrix[i][j] == 0) {
                row[i] = true;
                col[j] = true;
            }
        }
    }

       // Second Pass
       for(int i = 0 ; i < m ; i++){
        for(int j = 0 ; j < n ; j++){
            if (row[i] == true || col[j] == true) {
                matrix[i][j] = 0;
            }
        }
    }


    }
}
