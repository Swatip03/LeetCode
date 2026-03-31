public class MaximumAbsoluteSumOfAnySubarray {

    public int maxAbsoluteSum(int[] nums) {

        // See u know about kadane algo idk what it is used for but i just know it can give maximum sum of subarray inside the array then i
        // have a idea if i make every ele of array negated then what happens

        //finding sum of original array
        
        int maxPosSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i = 0 ; i < nums.length ; i++){

            currSum = currSum + nums[i];


            if (currSum > maxPosSum) {

                maxPosSum = currSum;
                
            }

            if (currSum < 0) {

                currSum = 0;
                
            }


        }

        // Negate all the element
        for(int j = 0; j < nums.length ; j++){

            nums[j] = -nums[j];

        }


        // Now apply kadane algo again
        int maxNegSum = Integer.MIN_VALUE;
        currSum = 0;

        for(int i = 0; i < nums.length ; i++){

            currSum = currSum + nums[i];

            if (currSum > maxNegSum) {

                maxNegSum = currSum;
                
            }

            if (currSum < 0) {

                currSum = 0;
                
            }

        }


        int maxSum = 0;
        if (maxPosSum > maxNegSum) {

            maxSum = maxPosSum;
            
        }
        else{

            maxSum = maxNegSum;

        }

        return maxSum;
        
    }

    public static void main(String[] args) {
        
        MaximumAbsoluteSumOfAnySubarray ma = new MaximumAbsoluteSumOfAnySubarray();

        int[] nums = {2,-5,1,-4,3,-2};
        int ans = ma.maxAbsoluteSum(nums);

        System.out.println(ans);

    }
    
}
