import java.util.Arrays;

public class ReshapeTheMatrix {


    public int[][] matrixReshape(int[][] mat, int r, int c) {

        // Let's check if the things are legal

        

        int m = mat.length;
        int n = mat[0].length;

        if (m*n != r*c) {

            return mat;
            
        }

        int[] arr = new int[m*n];

        int k = 0;

        for(int i = 0 ; i < m ; i++){

            for(int j = 0 ; j < n ; j++){

                arr[k] = mat[i][j];
                k++;

            }
        }

        int[][] newMat = new int[r][c];

        int l = 0;

        for(int i = 0 ; i < r ; i++){

            for(int j = 0 ; j < c ; j++){

                newMat[i][j] = arr[l];
                l++;
                

            }

        }



        return newMat;


        
    }


    public static void main(String[] args) {
        
        ReshapeTheMatrix rr = new ReshapeTheMatrix();

        int[][] mat = {{1,2},{3,4}};
        int r = 2;
        int c = 4;

        int[][] newMat = rr.matrixReshape(mat, r, c);

        System.out.println(Arrays.deepToString(newMat));

    }
    
}
