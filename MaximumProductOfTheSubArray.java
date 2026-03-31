public class MaximumProductOfTheSubArray {
    
    public int maxProduct(int[] nums) {

        int maxProd = Integer.MIN_VALUE;
        int prefProd = 1;
        int suffprod = 1;

        for(int i = 0 ; i < nums.length ; i++){


            if (prefProd == 0) {

                prefProd = 1;
                
            }

            if (suffprod == 0) {

                suffprod = 1;
                
            }

            
            prefProd = prefProd*nums[i];
            suffprod = suffprod*nums[nums.length-i-1];

            maxProd = Math.max(maxProd, Math.max(prefProd, suffprod));


            
        }

        return maxProd;
        
    }

    public static void main(String[] args) {
        
        MaximumProductOfTheSubArray mp =new MaximumProductOfTheSubArray();

        int[] nums = {2,3,-2,4};

        int ans = mp.maxProduct(nums);

        System.out.println(ans);
    }
}
