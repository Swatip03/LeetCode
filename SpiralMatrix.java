import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> lst = new ArrayList<>();

        int L = 0;
        int R = matrix[0].length;

        int T = 0;
        int B = matrix.length;

        while ((L < R) && (T < B)) {

            //Move from left to right 

            for(int i = L ; i < R ; i++){

                lst.add(matrix[T][i]);

            }

            T++;  // Updating the top pointer

            // Move from top to bottom

            for(int i = T ; i < B ; i++){

                lst.add(matrix[i][R-1]);

            }

            R--;

            // The below condition and traversal only possible due to following condition

            if ( T < B) {

                // Move from right to left

                for(int i = R-1 ; i >= L ; i--){

                    lst.add(matrix[B-1][i]);

                }

                B--;
                
            }

            if( L < R){

                // Move from bottom to top

                for(int i = B-1 ; i >= T ; i--){

                    lst.add(matrix[i][L]);


                }

                L++;

            }


            
        }



        return lst;
        
    }


    public static void main(String[] args) {

        SpiralMatrix ss = new SpiralMatrix();
        
        int[][] matrix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};

        List<Integer> lst = ss.spiralOrder(matrix);

        System.out.println(lst);




    }
}
