public class CellWithOddValuesInTheMatrix {
    public int oddCells(int m, int n, int[][] indices) {

         int[][] matrix = new int[m][n];


        for(int i = 0 ; i < matrix.length ; i++){

            for(int k = 0 ; k < indices.length ; k++){

                for(int l = 0 ; l < indices[k].length - 1; l++){

                    if (indices[k][l] == i) {

                        for(int j = 0 ; j < matrix[i].length ; j++){

                            matrix[i][j]++;

                        }
                        
                    }


                    for(int j = 0 ; j < matrix[i].length ; j++){

                        if (indices[k][l+1] == j) {

                            matrix[i][j]++;
                            
                        }

                    }

                }

            }


        }


        // For Finding the odd values in the matrix

        int numOfOddVal = 0;

        for(int i = 0 ; i < matrix.length ; i++){

            for(int j = 0 ; j < matrix[i].length ; j++){

                if (matrix[i][j] % 2 != 0) {

                    numOfOddVal++;
                    
                }

            }

        }

        return numOfOddVal;
        
    }

    public static void main(String[] args) {
        
        CellWithOddValuesInTheMatrix cc = new CellWithOddValuesInTheMatrix();

        int m = 2;
        int n = 2;

        int[][] indices = {{1,1},{0,0}};

        int oddval = cc.oddCells(m, n, indices);


        System.out.println("The odd values in the given matrix is :: "+ oddval);

    }
}
