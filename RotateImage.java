import java.util.Arrays;

public class RotateImage {
    
    public void rotate(int[][] matrix) {

        int n = matrix.length;

        // Firstly store all the elements of the matrix in an array

        int[] arr = new int[n*n];

        int idx = 0;

        for(int i = 0 ; i < matrix.length ; i++){

            for(int j = 0 ; j < matrix[i].length ; j++){

                arr[idx] = matrix[i][j];

                idx++;

            }


        }

        // Now get the elemnets of the array and update the matrix;

        idx = 0;

        for(int i = 0 ; i < matrix.length ; i++){

            for(int j = 0  ; j < matrix[i].length ; j++){

                matrix[j][n-1-i] = arr[idx];

                idx++;


            }
        }



        

        
        
    }


    public static void main(String[] args) {

        RotateImage ri = new RotateImage();
        
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(Arrays.deepToString(matrix));

        ri.rotate(matrix);

        System.out.println(Arrays.deepToString(matrix));
        

        
    }
}
