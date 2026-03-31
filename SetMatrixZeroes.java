import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZeroes {

    
    public void setZeroes(int[][] matrix) {

        ArrayList<Integer> rows = new ArrayList<>(); // To store the index of the zero valued elements
        ArrayList<Integer> cols = new ArrayList<>(); 
        for(int i = 0 ; i < matrix.length ; i++){

            for(int j = 0 ; j < matrix[i].length ; j++){

                if (matrix[i][j] == 0) {

                    rows.add(i);
                    cols.add(j);
                    
                }


            }


        }

        // Now making the elemnts zeroes corresponding to the rows and columns of the list 

        

        for(int i = 0 ; i < matrix.length ; i++){

            for(int j = 0 ; j < matrix[i].length ; j++){

                if (rows.contains(i) || cols.contains(j)) {

                    matrix[i][j] = 0;
                    
                }


            }


        }



       
        
    }


    public static void main(String[] args) {

        SetMatrixZeroes ss = new SetMatrixZeroes();
        
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};

        System.out.println(Arrays.deepToString(matrix));

        ss.setZeroes(matrix);

        System.out.println(Arrays.deepToString(matrix));

        
    }
}
