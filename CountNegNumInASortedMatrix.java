public class CountNegNumInASortedMatrix {

    public int countNegatives(int[][] grid) {

        int cnt = 0;

        for(int i = 0 ; i < grid.length ; i++){

            int start = 0;
            int end = grid[i].length;

            while (start <= end) {

                int mid = start + (end - start)/2;

                if (grid[i][mid] < 0 && (mid != 0 && grid[i][mid - 1] > grid[i][mid] )) {

                    cnt++;

                   start = mid + 1;

                    
                }
                if (grid[i][mid] >= 0) {

                    start = mid + 1;
                    
                }

                if (grid[i][mid] < 0 && (mid != 0 && grid[i][mid - 1] <= grid[i][mid])) {

                    end = mid - 1;
                    
                }
                
            }

        }

        if (cnt == 0) {

            return 0;
            
        }



        return cnt;  
        
    }

    public static void main(String[] args) {
        
        CountNegNumInASortedMatrix cc = new CountNegNumInASortedMatrix();

        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};

        int numOfNegNum = cc.countNegatives(grid);

        System.out.println("The Number of Negative Number in the Grid is :: "+numOfNegNum);
    }
    
}
