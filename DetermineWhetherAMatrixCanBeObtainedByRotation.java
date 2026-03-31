public class DetermineWhetherAMatrixCanBeObtainedByRotation {

    public int[][] rotate90(int[][] mat){

        int n = mat.length;

        int[][] rotated = new int[n][n];

        for(int i = 0; i < mat.length ; i++){

            for(int j = 0 ; j < mat.length ; j++){

                rotated[j][i] = mat[mat.length-1-i][j];

            }

        }

        return rotated;

    }

    public boolean areMatricesEqual(int[][] mat , int[][] target){

        int n = mat.length;

        for(int i = 0 ; i < n  ; i++ ){

            for(int j = 0 ; j < n ; j++){

                if (mat[i][j] != target[i][j]) {

                    return false;
                    

                }

            }

        }

        return true;


    }

    //// Function to check if the matrix can be made equal to target by rotating
    public boolean findRotation(int[][] mat, int[][] target) {

        for(int cnt = 0 ; cnt < 4 ; cnt++){

            if (areMatricesEqual(mat, target)) {

                return true;
                
            }

            mat = rotate90(mat);

        }


        return false;
  
    }

    public static void main(String[] args) {

        DetermineWhetherAMatrixCanBeObtainedByRotation dd = new DetermineWhetherAMatrixCanBeObtainedByRotation();
        
        int[][] mat = {
                      {0,0,0},
                      {0,1,0},
                      {1,1,1}
                       };

        int[][] target = {
                        {1,1,1},
                        {0,1,0},
                        {0,0,0}
                          };

        
        boolean isTarget = dd.findRotation(mat, target);

        System.out.println(isTarget);
                          
       
                          
    }
}
