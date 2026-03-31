import java.util.ArrayList;
import java.util.List;

public class LuckyNumberInAMatrix {
    
    public List<Integer> luckyNumbers(int[][] matrix) {

        List<Integer> lst = new ArrayList<>();

        int[] rowMin = new int[matrix.length];

        int idx = 0;

        for(int i = 0 ; i < matrix.length ; i++){

            int min = matrix[i][0];
            

            for(int j = 0 ; j < matrix[i].length ; j++){

                if (min > matrix[i][j]) {

                    min = matrix[i][j];
                    
                }  

            }

            rowMin[idx] = min;
            idx++;

        }

        int[] colMax = new int[matrix[0].length];

        int cdx = 0;

        for(int i = 0 ; i < matrix[0].length ; i++){

            int max = matrix[0][i];
            

            for(int j = 0 ; j < matrix.length ; j++){

                if (max < matrix[j][i]) {

                    max = matrix[j][i];
                    
                }  

            }

            colMax[cdx] = max;
            cdx++;
            
        }

        for(int i = 0 ; i < rowMin.length ; i++){
             
            for(int j = 0; j < colMax.length ;j++){

                if (rowMin[i] == colMax[j]) {

                    lst.add(rowMin[i]);
                    
                }
            }
        }
        

        return lst;
    }


    public static void main(String[] args) {

        LuckyNumberInAMatrix ln = new LuckyNumberInAMatrix();

        int[][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};

        List<Integer> lst = ln.luckyNumbers(matrix);

        System.out.println(lst);
        
    }
}
