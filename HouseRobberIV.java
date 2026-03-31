public class HouseRobberIV {
    
    public int minCapability(int[] nums, int k) {

        // Firstly find the sum of the array nums
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){

            sum = sum + nums[i];

        }

        int left = 1;
        int right = sum / k;
        int ans = Integer.MAX_VALUE;

        while (left <= right) {

            int mid = left + (right-left)/2;

            if (mid == 0) {

                return 0;
                
            }

            int cnt = 0;
            for(int i = 0 ; i < nums.length ; i++){

                cnt = cnt + (nums[i]/mid);

            }

            if (cnt >= k) {

                ans = Math.min(ans, mid);
                left = mid + 1;
                
            }

            else{

                right = mid-1;

            }
            
        }

        return ans;
        
    }

    public static void main(String[] args) {
        
        HouseRobberIV hr = new HouseRobberIV();

        int[] nums = {2,7,9,3,1};
        int k = 2;

        int ans = hr.minCapability(nums, k);

        System.out.println(ans);
    }
}
