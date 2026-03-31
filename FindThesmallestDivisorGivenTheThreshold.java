

public class FindThesmallestDivisorGivenTheThreshold {

    public int resultantSum(int[] nums , int div){

        int reSum = 0;

        for(int i = 0 ; i < nums.length ; i++){

            if ((nums[i] % div) != 0 ) {

                
                reSum = reSum + (nums[i]/div) + 1;

            }
            else{
 
                reSum = reSum + nums[i]/div;

            }
        }


        return reSum;

    }

    public int minEle(int[] nums){

        int min = 0;

        for(int i = 0; i < nums.length ; i++){

            if (nums[i] < min) {

                min = nums[i];
                
            }
        }

      return min;
        
    }

    public int maxEle(int[] nums){

        int max = 0;

        for(int i = 0; i < nums.length ; i++){

            if (nums[i] > max) {

                max = nums[i];
                
            }
        }

      return max;

        
    }


    
    public int smallestDivisor(int[] nums, int threshold) {

        int left = minEle(nums);
        int right = maxEle(nums);


        while (left < right) {

            int div = left + (right-left)/2;

            if (resultantSum(nums, div) == threshold) {

                return div;
                
            }

            if (resultantSum(nums, div) < threshold) {

                right--;

                
            }

            if (resultantSum(nums, div) > threshold) {

                left++;
                
            }
            
        }


        return right;


        
        
    }


    public static void main(String[] args) {

        FindThesmallestDivisorGivenTheThreshold fsd = new FindThesmallestDivisorGivenTheThreshold();

        int[] nums = {44,22,33,11,1};

        int threshold = 5;

        int smdiv = fsd.smallestDivisor(nums, threshold);

        System.out.println(smdiv);
        

    }
}
