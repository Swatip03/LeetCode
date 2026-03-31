import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    
    public int[] productExceptSelf(int[] nums) {

        int[] ans = new int[nums.length];

        int[] preFix = new int[nums.length];         // To store the prefix products of the array
        int[] postFix = new int[nums.length];        // To store the postfix products of the array

        int prod1 = 1;

        for(int i = 0; i < nums.length ; i++){

            prod1 = prod1*nums[i];

            preFix[i] = prod1;


        }

        int prod2 = 1;

        for(int j = nums.length - 1 ; j >= 0 ; j--){

            prod2 = prod2*nums[j];

            postFix[j] = prod2;

        }

        // Filling of the answer 

        int idx = 0;

        while (idx < nums.length) {

            if (idx == 0) {

                ans[idx] = 1*postFix[idx+1];
                
            }
            else if (idx == nums.length - 1) {

                ans[idx] = preFix[idx-1]*1;
                
            }
            else{

                ans[idx] = preFix[idx-1]*postFix[idx+1];

            }

            idx++;
            
        }


       return ans;
    }


    public static void main(String[] args) {
        
        ProductOfArrayExceptSelf pp = new ProductOfArrayExceptSelf();

        int[] nums = {-1,1,0,-3,3};

        int[] ans = pp.productExceptSelf(nums);

        System.out.println(Arrays.toString(ans));

    }
}
