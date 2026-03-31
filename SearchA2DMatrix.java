public class SearchA2DMatrix {
    
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

        int[] arr = new int[m*n];

        int idx = 0;

        for(int i = 0; i < matrix.length ; i++){

            for(int j = 0 ; j < matrix[i].length  ;j++){

                arr[idx] = matrix[i][j];
                idx++;

            }

        }

        // Now applying binary search on this array

        int start = 0;
        int end = arr.length-1;

        while (start <= end) {

            int mid = start + (end-start)/2;

            if (arr[mid] == target) {

                return true;
                
            }

            if (arr[mid] > target) {

                end = mid-1;
                
            }

            if (arr[mid] < target) {

                start = mid+1;
                
            }

            
        }


        return false;
        
    }


    public static void main(String[] args) {
        
        SearchA2DMatrix sm = new SearchA2DMatrix();

        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 13;

        boolean ans = sm.searchMatrix(matrix, target);

        System.out.println(ans);
    }

}
