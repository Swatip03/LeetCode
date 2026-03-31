public class SquaresOfASortedArray {
    
    public int[] sortedSquares(int[] nums) {

        int[] sqNums = new int[nums.length];

        for(int i = 0 ; i < sqNums.length ; i++){

            sqNums[i] = nums[i]*nums[i];

        }

        // Sorting the array

        for(int i = 0 ;i < sqNums.length ; i++){

            for(int j = 1 ; j < sqNums.length - i ; j++){

                if(sqNums[j] < sqNums[j-1]){

                    int temp = sqNums[j];
                    sqNums[j] = sqNums[j-1];
                    sqNums[j-1] = temp;

                }

            }

        }

        return sqNums;
        
    }

    public static void main(String[] args) {
        
        SquaresOfASortedArray ss = new SquaresOfASortedArray();

        int[] nums = {-4,-1,0,3,10};

        int[] sqNums = ss.sortedSquares(nums);

        for(int i = 0 ; i < sqNums.length ; i++){

            System.out.print(sqNums[i] + " ");

        }

    }
}
