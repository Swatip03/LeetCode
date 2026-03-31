public class LongestStrictlyDecAndIncSubArray {
    
    public int longestMonotonicSubarray(int[] nums) {

        if (nums.length == 0) {

            return 0;
            
        }

        int maxLen = 1;
        int incLen = 1;
        int decLen = 1;

        for(int i = 0 ; i < nums.length-1 ; i++){

            if (nums[i] < nums[i+1]) {

                incLen++;       // When the two ele encountered inc then we will increment the length
                decLen = 1;     // We will set the decLen to 1

                if (maxLen < incLen) {

                    maxLen = incLen;
                    
                }
                
            }

            else if (nums[i] > nums[i+1]) {

                decLen++;        //When the two ele encountered dec then we will decrement the length
                incLen = 1;      // We will set the incLen to 1

                if (maxLen < decLen) {

                    maxLen = decLen;
                    
                }
                
            }

            else{

                incLen = 1;
                decLen = 1;

            }

        }

        return maxLen;
        
    }


    public static void main(String[] args) {
        
        LongestStrictlyDecAndIncSubArray ls = new LongestStrictlyDecAndIncSubArray();

        int[] nums = {1,4,3,3,2};

        int ans = ls.longestMonotonicSubarray(nums);

        System.out.println(ans);
    }
}
