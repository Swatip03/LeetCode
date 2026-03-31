

public class MaximumSumOfPairWithEqualSumOfDigits {

    public  int digitsum(int N){

        if (N / 10 == 0) {

          return N;  

        }

        return  (N % 10) + digitsum(N/10);


    }
    
    public int maximumSum(int[] nums) {

        int maxSum = -1;
        
        // Let us take the arrays approach in which the array index will represent the digit sum and the value of that index will represent the number that has that digit sum

        int[] maxDigitSum = new int[82];  // As the maximum digit sum possible is 81

        for(int i = 0 ; i < nums.length ; i++){

            int sum = digitsum(nums[i]);

            if (maxDigitSum[sum] > 0) {

                maxSum = Math.max(maxSum, maxDigitSum[sum]+nums[i]);
                
            }

            maxDigitSum[sum] = Math.max(maxDigitSum[sum], nums[i]);
        }


        return maxSum;

    }


    public static void main(String[] args) {
        
        MaximumSumOfPairWithEqualSumOfDigits ms = new MaximumSumOfPairWithEqualSumOfDigits();

        int[] nums = {18,43,36,13,7};
        int ans = ms.maximumSum(nums);

        System.out.println(ans);

    }
}
