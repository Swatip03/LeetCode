public class TransposeOfAMatrix {
    
    public int[][] transpose(int[][] matrix) {

        // Finding the size of columns of the matrix

        int count = 0;

        for(int j = 0 ; j < matrix[0].length ; j++){

            count++;

        }

      int colLength = count;
      int rowLength = matrix.length;
      
      // To find the transpose the number of rows in the matrix will become number of col in transpose viceversa

      int[][] transpose = new int[colLength][rowLength];

      for(int i = 0 ; i < transpose.length ; i++){

        for(int j = 0 ; j < transpose[i].length ; j++){

            if (i == j) {

                transpose[i][j] = matrix[i][j];
                
            }
            else{

                transpose[i][j] = matrix[j][i];

            }

        }

      }



        

        return transpose;
        
    }

    public static void main(String[] args) {
        
        TransposeOfAMatrix tt = new TransposeOfAMatrix();

        int[][] matrix = {
                         {1,2,3},
                         {4,5,6}
                         };

       int[][] transpose = tt.transpose(matrix);

       // Displaying the transpose matrix
       
       System.out.print("[");

       for(int i = 0 ; i < transpose.length ; i++){

           System.out.print("[");

           for(int j = 0 ; j < transpose[i].length ; j++ ){

               System.out.print(transpose[i][j]);

               if (j < transpose[i].length - 1) {

                   System.out.print(",");
                   
               }

           }

           System.out.print("]");

       }

       System.out.println("]");
    }
}
