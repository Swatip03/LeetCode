import java.util.HashMap;

public class SubarraySumEqualTok {
    
    public int subarraySum(int[] nums, int k) {

        int sum = 0;
        int[] preSum = new int[nums.length];

        for(int i = 0 ; i < nums.length ; i++){

            sum = sum + nums[i];
            preSum[i] = sum;

        }

        HashMap<Integer,Integer> hmap = new HashMap<>();
        hmap.put(0, 1);

        int cnt = 0;

        for(int i = 0 ; i < preSum.length ; i++){

            if (hmap.containsKey(preSum[i]-k)) {

                cnt = cnt + hmap.get(preSum[i]-k);
                
                
            }

            if (hmap.containsKey(preSum[i])) {

                hmap.put(preSum[i], hmap.get(preSum[i]) + 1);

            } else {

                hmap.put(preSum[i], 1);

            }
            
        }


        return cnt;


        
    }


    public static void main(String[] args) {
        
        SubarraySumEqualTok ss = new SubarraySumEqualTok();

        int[] nums = {1,2,3,-3,1,1,1,4,2,-3};
        int k = 3;

        int ans = ss.subarraySum(nums, k);

        System.out.println(ans);
    }
}
