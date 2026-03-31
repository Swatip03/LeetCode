public class SubArrayProductLessThanK {
    
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        int left = 0;
        int right = 0;
        int prod = 1;
        int cnt = 0;

        while (right < nums.length) {

            prod = prod*nums[right];

            if (prod > k) {

                prod = prod/nums[left];
                left++;
                
            }

            if (prod < k) {

                cnt++;
                
            }

            right++;
            
        }


        return cnt;
        
    }


    public static void main(String[] args) {
        
        int[] nums = {10,5,2,6};
        int k = 100;

        SubArrayProductLessThanK sbp = new SubArrayProductLessThanK();

        int ans = sbp.numSubarrayProductLessThanK(nums, k);

        System.out.println(ans);


    }
}
