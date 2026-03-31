import java.util.HashMap;

public class CountNumberOfNiceSubArrays {
    
    public int numberOfSubarrays(int[] nums, int k) {

        int[] rem = new int[nums.length];

        // Make all the elements of the array in the remainder of the 2

        for(int i = 0 ; i < nums.length ; i++){

            rem[i] = nums[i] % 2;

        }

        // Now count all the subarray whose sum is equal to the k

        int[] preSum = new int[rem.length];
        int sum = 0;

        for(int i = 0; i < preSum.length ; i++){

            sum = sum + rem[i];

            preSum[i] = sum;

        }

        HashMap<Integer,Integer> hMap = new HashMap<>();
        hMap.put(0, 1);
        int cnt = 0;

        for(int i = 0 ; i < preSum.length ; i++){

            if (hMap.containsKey(preSum[i]-k)) {

                cnt = cnt + hMap.get(preSum[i]-k);
                
            }


            if (hMap.containsKey(preSum[i])) {

                hMap.put(preSum[i], hMap.get(preSum[i])+1);
                
            }
            else{

                hMap.put(preSum[i], 1);

            }

        }

        return cnt;

        
    }

    public static void main(String[] args) {

        CountNumberOfNiceSubArrays sn = new CountNumberOfNiceSubArrays();
        
        int[] nums = {2,2,2,1,2,2,1,2,2,2};
        int k = 2;

        int ans = sn.numberOfSubarrays(nums, k);

        System.out.println(ans);


    }
}
