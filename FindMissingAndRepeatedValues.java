import java.util.Arrays;
import java.util.HashMap;

public class FindMissingAndRepeatedValues {
    
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int n = grid.length;
        int[] eleArr = new int[n*n];
        int idx = 0;

        for(int i = 0 ; i < grid.length ; i++){

            for(int j = 0 ; j < grid[i].length ; j++){

                eleArr[idx] = grid[i][j];
                idx++;

            }

        }

        HashMap<Integer,Integer> hMap = new HashMap<>();

        for(int i = 0 ; i < eleArr.length ; i++){

            if (hMap.containsKey(eleArr[i])) {

                hMap.put(eleArr[i], hMap.get(eleArr[i])+1);
                
            }
            else{

                hMap.put(eleArr[i], 1);

            }

        }

        System.out.println(hMap);


        int[] res = new int[2]; // res[0] = repeated number // res[1] = missing number


        for(int i = 1 ; i <= n*n ; i++){


            if (hMap.containsKey(i) && hMap.get(i) == 2) {

                res[0] = i;
                
            }

            
            if (!hMap.containsKey(i)) {

                res[1] = i;
                
            }

        }

         
        return res;

        
    }


    public static void main(String[] args) {
        
        FindMissingAndRepeatedValues fm = new FindMissingAndRepeatedValues();

        int[][] grid = {{1,3},{2,2}};

        int[] ans = fm.findMissingAndRepeatedValues(grid);

        System.out.println(Arrays.toString(ans));

    }
}
