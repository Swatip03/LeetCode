public class MinimumNumberOfOperationsToGetABinaryArrayOf1 {

    public boolean allSame(int[] nums){

        for(int i = 0 ; i < nums.length ; i++){

            if (nums[i] == 0) {

                return false;
                
            }
        }

        return true;

    }
    
    public int minOperations(int[] nums) {

        // I am going to use fixed sized size sliding window of length 
        for(int i = 0 ; i < 3 ; i++){

            if (nums[i] == 0) {

                nums[i] = 1;
                
            }
            else{

                nums[i] = 0;

            }

        }

        if (allSame(nums)) {

            return 1;
            
        }

        int cnt = 1;

        
        int j = 2;

        while (j < nums.length - 1) {

            
            j++;

            if (nums[j] == 0) {

                nums[j] = 1;
                cnt++;
                
            }
            else{

                nums[j] = 0;
                cnt++;

            }
            
        }


        if (allSame(nums)) {

            return cnt;
            
        }
        else{

            return -1;

        }

        
    }

    public static void main(String[] args) {
        
        MinimumNumberOfOperationsToGetABinaryArrayOf1 mn = new MinimumNumberOfOperationsToGetABinaryArrayOf1();

        int[] nums = {0,1,1,1,0,0};

        int ans = mn.minOperations(nums);

        System.out.println(ans);

    }

}
