public class MatrixDiagonalSum {

    public int diagonalSum(int[][] mat) {

        int sum = 0;
        int m = mat.length;

        for(int i = 0 ; i < m ; i++){

            for(int j = 0 ; j < m ; j++){

                if (i == j) {

                    sum = sum + mat[i][j];
                    
                }

                if (i + j == m - 1 && i != j) {

                    sum = sum + mat[i][j];
                    
                }

            }

        }



        return sum;
    }


    public static void main(String[] args) {

        MatrixDiagonalSum mm = new MatrixDiagonalSum();
        
        int[][] mat = {{1,1,1,1},
                       {1,1,1,1},
                       {1,1,1,1},
                       {1,1,1,1}
                      };

       int diagonalSum =  mm.diagonalSum(mat);
       
       
       System.out.println("The diagonal sum of the matrix is : "+ diagonalSum   );
    }
}
